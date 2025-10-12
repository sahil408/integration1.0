
public class GCDof2Strings {

    public static String callgcdStr(String str1, String str2) {
        int n = gcdno(str1, str2);
        String s = str1.substring(0, n);
        if (str1.equals(repeatstr(s, str1.length() / n)) && str2.equals(repeatstr(s, str2.length() / n))) {
            return s;
        }
        return "Not a GCD String " + str1 + " " + str2;
    }

    public static String repeatstr(String str, int count) {
        return str.repeat(count);
    }

    public static int gcdno(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    public static void main(String[] args) {
        String str1 = "sahsah";
        String str2 = "sah";
        String str = callgcdStr(str1, str2);
        System.out.println(str);
    }
}
