package CodesL1;

public class palindrome {
    public static void callint(int n){
        int org = n;
        int rev =0;
        while(n!=0){
            rev = rev*10 + n%10;
            n=n/10;
        }
        if(rev==org){
            System.out.println(org+ " " + "Number is Palindrome");
        }else
            System.out.println(org+ " " + "Number is not Palindrome");
       
    }

    public static void callstring(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
           rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println(s + " "+ "String is Palindrome");
        }else
            System.out.println(s + " "+ "String is not Palindrome");
    }

    public static void callbuilder(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String rev = sb.toString();

        if(rev.equals(s)){
            System.out.println(s + " "+ "String is Palindrome");
        }else
            System.out.println(s + " "+ "String is not Palindrome");
        }
    
    
    public static void main(String[] args) {
        int n = 16161;
        String s = "sahhas";
        callint(n);
        callstring(s);
        callbuilder(s);
    }
}
