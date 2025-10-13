
public class mergetwostringsalternatively {
    public static void codemerge(String str1, String str2){
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        while(i< str1.length() || j<str2.length()){
            if(i<str1.length()){
                sb.append(str1.charAt(i));
                i++;
            }
            if(j<str2.length()){
                sb.append(str2.charAt(j));
                j++;
            }
        }

        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str1 = "sahil";
        String str2 = "Diksha";

        codemerge(str1, str2);
    }
}
