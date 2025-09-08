package CodesL2.Stacks;

import java.util.Stack;

public class parenthesischeckinString {

    public static void main(String[] args) {
        String s = "{[()]]}";

        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }
            else if(ch==')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
            }
            else if(ch==']' && !st.isEmpty() && st.peek() == '['){
                st.pop();
            }
            else if(ch=='}' && !st.isEmpty() && st.peek() == '{'){
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
    
}
