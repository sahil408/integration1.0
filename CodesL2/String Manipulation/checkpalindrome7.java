
public class checkpalindrome7 {

    public static String reverseStr(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

    public static void reverseNum(int n) {
        String s1 = Integer.toString(n);
        String str = reverseStr(s1);

        if (s1.equals(str)) {
            System.out.println("Numbers are Palindrome");
        } else {
            System.out.println("Numbers are not palindrome");
        }
    }

    public static void reverseNumOrg(int n) {
        int org = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        if (org == rev) {
            System.out.println("Numbers are Palindrome");
        } else {
            System.out.println("Numbers are not palindrome");
        }
    }

    public static void main(String[] args) {
        String str = "12344321";
        String nStr = reverseStr(str);
        if (str.equals(nStr)) {
            System.out.println("Strings are Palindrome");
        } else {
            System.out.println("Strings are not palindrome");
        }

        int n = 12343211;
        reverseNum(n);

        int n1 = 1234321;
        reverseNumOrg(n1);

    }
}
