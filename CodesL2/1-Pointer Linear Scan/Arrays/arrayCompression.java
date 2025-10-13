
import java.util.Arrays;

public class arrayCompression {
    public static char[] callcomp(char[] ch){
        String s = new String(ch);
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        do{
            int count =0;
            char[] ch1 = s.toCharArray();
            for(int i=0; i< len;i++){
                if(ch1[0]==ch1[i] && Character.isLetterOrDigit(ch[0])){
                    count++;
                }}
                if(count>=1){
                    sb.append(ch1[0]).append(count);
                }
                //how to remove first char from char array which is already counted
                s = s.replaceAll(Character.toString(ch1[0]), "");
                len = s.length();           
        }while(len!=0);
        System.out.println(sb);
        return sb.toString().toCharArray();
    }
    public static void main(String[] args) {
        char[] ch = {'a','a','b','b','c','d'};
        char[] out = callcomp(ch);
        System.out.println(Arrays.toString(out));
    }
}
