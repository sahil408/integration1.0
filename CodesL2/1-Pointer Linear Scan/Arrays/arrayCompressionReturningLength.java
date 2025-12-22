import java.util.Arrays;

public class arrayCompressionReturningLength {

    // Keep in mind we have to return consecutive Characters
    // OP - abzcd3

    public static int callcompConsecutive(char[] ch){
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i<ch.length){
            char currchar = ch[i];
            int count =0;

            while(i<ch.length && ch[i] == currchar){
                i++;
                count++;
            }
            sb.append(currchar);
            if(count>1){
                sb.append(count);
            }   
        }
        for(int j=0;j<ch.length-1;j++){
            ch[j] = sb.charAt(j);
        }
        System.out.println(Arrays.toString(ch));
        return sb.length();
    }
    public static void main(String[] args) {
        char[] ch = {'a','b','z', 'c', 'd','d','d'};
        int out = callcompConsecutive(ch);
        System.out.println(out);
    }
}
