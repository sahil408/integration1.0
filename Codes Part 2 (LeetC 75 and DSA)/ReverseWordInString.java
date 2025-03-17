public class ReverseWordInString {

    public static void reverseWords(String s){
        
        String[] s1 = s.split(" ");

        StringBuffer sb = new StringBuffer();

        for(int i=s1.length-1;i>=0;i--){
            sb.append(s1[i]).append(" ");
        }
        System.out.println(sb.toString());


        // Solve for when spaces is large
        //solve for recurssion
        
    }

    public static void main(String[] args) {

        String str= "I had a nice day";
        reverseWords(str);
        
       
    }
}