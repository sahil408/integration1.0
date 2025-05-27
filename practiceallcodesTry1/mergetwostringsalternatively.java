package practiceallcodesTry1;

public class mergetwostringsalternatively {
    public static void codemerge(String str1, String str2){
        // char[] ch1 = str1.toCharArray();
        // char[] ch2 = str2.toCharArray();
        //Wrong Implemenation
        //If one string is longer than the other, your loop may throw an ArrayIndexOutOfBoundsException
        //You shouldn't assume both strings will always have the same length
        StringBuilder sb = new StringBuilder();
        // for(int i=0, j=0; i<ch1.length-1 || j<ch2.length-1; i++,j++){
        //     sb.append(ch1[i]);
        //     sb.append(ch2[j]);
        // }
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
