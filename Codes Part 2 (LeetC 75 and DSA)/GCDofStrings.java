public class GCDofStrings {

    public static String findgcd(String s1, String s2){

        int gcdno= commondivisor(s1,s2);

        String gcdstring = s1.substring(0,gcdno);

        if(s1.equals(repeatString(gcdstring, s1.length()/gcdno))&&s2.equals(repeatString(gcdstring, s2.length()/gcdno))){
            return gcdstring; 
        }
        return "";
    }

    public static String repeatString(String str, int times){
        return str.repeat(times);
    }

    public static int commondivisor(String s1, String s2){
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
        String str1 = "sahil";
        String str2 = "sahilsahil";

        String str = findgcd(str1,str2);

        System.out.println("GCD is " + str);
    }
}
