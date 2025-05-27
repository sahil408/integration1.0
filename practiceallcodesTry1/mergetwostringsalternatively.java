package practiceallcodesTry1;

public class mergetwostringsalternatively {
    public static void codemerge(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i=0, j=0; i<ch1.length-1 || j<ch2.length-1; i++,j++){
            sb.append(ch1[i]);
            sb.append(ch2[j]);
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str1 = "sahil";
        String str2 = "Diksha";

        codemerge(str1, str2);
    }
}
