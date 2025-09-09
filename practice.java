import java.util.Arrays;
import java.util.Stack;

public class practice {
    public static void callfun(String s){

        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }else if(ch==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }else if(ch==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }else if(ch=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }else{
                System.out.println("String do not have valid Paranthesis");
                break;
            }
        }
        if(st.isEmpty()){
            System.out.println("String have valid Paranthesis");
        }
    
        
    }
    public static void main(String[] args) {
        String s = "{[()]}";

        callfun(s);
    }
}


