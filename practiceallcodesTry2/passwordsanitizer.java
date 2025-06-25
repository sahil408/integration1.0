package practiceallcodesTry2;
import java.util.ArrayList;
import java.util.List;

public class passwordsanitizer {

    public static void callsanitizer(List<String> ls){

        StringBuilder sb = new StringBuilder();

       for(String s: ls){
            if(s.length()<5){
                continue;  /// This means we are continuing next value of ls, if we found any string less than 5
            }

            boolean hasdigit = false;
            boolean hasletter = true;

            for(char c: s.toCharArray()){
                if(Character.isDigit(c)){
                    hasdigit = true;
                }else if(Character.isLetter(c)){
                    hasletter = true;
                }

                if(hasdigit && hasletter){
                    break;
                }
            }

            if(hasdigit && hasletter){
                sb.append(s).append(" ");
                
            }
       }
       System.out.println(sb.toString().trim());

    }
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(List.of("p@c1","word@321", "wordpass", "987345", "word@123", "987345"));
        callsanitizer(ls);
    }
    
}
