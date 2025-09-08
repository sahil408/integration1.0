
public class swappingstringwithout3rdvariable {
    public static void callswap(String s1, String s2){
        s1 = s1 +s2;
        System.out.println(s1);
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length(), s1.length());
        
        System.out.println("After Swapping: " + s1 + " " + s2);   
    }
    public static void main(String[] args) {
        String str1 = "sahil";
        String str2 = "kundan";
        System.out.println("Before Swapping: " + str1 + " " + str2);
        callswap(str1, str2);
    }
}
