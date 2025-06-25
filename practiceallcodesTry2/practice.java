package practiceallcodesTry2;



public class practice {

    public static String callfunc(String s1, String s2){

        int n = gcdofstr(s1, s2);
        String s3 = s1.substring(0, n);

        if(s1.equals(strcount(s3, s1.length()/n ))&& s2.equals(strcount(s3, s2.length()/n))){
            return s3;
        }
        return "";
    }

    public static String strcount(String s, int count){
        return s.repeat(count);
    }

    public static int gcdofstr(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();

        while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;

        }
        return n1;
    }

    

       
    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABC";
        String s3 = callfunc(s1, s2);
        System.out.println(s3);
    }
}
