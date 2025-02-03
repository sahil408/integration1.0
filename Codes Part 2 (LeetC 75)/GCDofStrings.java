public class GCDofStrings {

    public static String findgcd(String s1, String s2){

        int gcdno= commondivisor(s1,s2);

        String gcdstring = s1.substring(0,gcdno);


        return gcdstring; 
    }

    public static int commondivisor(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();



        return n1;
    }
    public static void main(String[] args) {
        String str1 = "sahil";
        String str2 = "sa";

        String str = findgcd(str1,str2);

        System.out.println("GCD is " + str);
    }
}
