
public class stringCompressionReturningLength {

    // Keep in mind we have to return consecutive Characters


    public static int callcompConsecutive(char[] chars){
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i<chars.length){
            char currchar = chars[i];
            int count =0;

            while(i<chars.length && chars[i] == currchar){
                i++;
                count++;
            }
            sb.append(currchar);
            if(count>1){
                sb.append(count);
            }   
        }
        for(int j=0;j<sb.length();j++){
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }


    public static void main(String[] args) {
        char[] ch = {'a','b', 'c', 'd','d','d'};
        int out = callcompConsecutive(ch);
        System.out.println(out);
    }
}
