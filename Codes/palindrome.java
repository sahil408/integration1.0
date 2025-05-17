public class palindrome {
    public static void main(String[] args) {
        int num = 16161;
        int rev = 0;


        // String Palindrome
        String str = "abba";
        String revString = "";

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        revString = sb.reverse().toString();

        if(revString.equals(str)){
            System.out.println("String is Palindrome");
        }



        // Integer Palindrome
        String ni = Integer.toString(num);
        String revi = Integer.toString(rev);

        StringBuilder sb1 = new StringBuilder();
        sb1.append(ni);
        revi = sb1.reverse().toString();

        if(revi.equals(ni)){
            System.out.println("Integer is Palindrome");
        }


    }
}
