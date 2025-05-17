public class mergeStringsAlternatively {

     public static void main(String[] args) {
        
        String str1 = "Sahil";
        String str2 = "Diksha";

       // char[] ch1 = str1.toCharArray();
        //char[] ch2 = str2.toCharArray();

        StringBuilder res = new StringBuilder();
        int i=0;int j=0;

        while(i<str1.length() || j<str2.length()){
            if(i<str1.length()) {
                res.append(str1.charAt(i));
                i++;
            }
            if(j<str2.length()) {
                res.append(str2.charAt(j));
                j++;
            }
        }
        System.out.println(res.toString());

        
    }
}