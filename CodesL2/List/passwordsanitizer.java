package CodesL2.List;

import java.util.ArrayList;
import java.util.List;

public class passwordsanitizer {

    public static String passwordSanitizerCall (List<String> ls){
        StringBuilder sb = new StringBuilder();

        for(String s: ls){
            if(s.length()<5){
                continue;   
            }
        

            boolean hasletter = false;
            boolean hasdigit = false;

            for(char c: s.toCharArray()){
                if(Character.isLetter(c)){
                    hasletter = true;
                }
                else if(Character.isDigit(c)){
                    hasdigit = true;
                }

                if(hasdigit && hasletter){
                    break;
                }
            }
            if(hasletter && hasdigit){
                sb.append(s);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(){
        {
            add("p@c1");
            add("word@321");
            add("wordpass");
            add("987345");
            add("word@123");
        }};
        String str = passwordSanitizerCall(ls);
        System.out.println(str);
    }
}
