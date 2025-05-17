import java.util.Stack;

public class paranthesis {

    public static void main(String[] args) {
        String s = "{[()]}";
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for(char c: s.toCharArray()){
            if( c == '{' || c=='['|| c=='(' ){
                stack.push(c);
            }
            else if(c==')' && !s.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(c==']' && !s.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if(c=='}' && !s.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else{
                isValid = false;
            }
            
        }
        System.out.println("Given String Paranthesis " + s + "is " + isValid);

    }
    
}
