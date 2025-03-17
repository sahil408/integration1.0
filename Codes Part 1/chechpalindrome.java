public class chechpalindrome {
    public static void checkPalindrome(String s1) {
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            if (ch[i] != ch[ch.length - i - 1]) {
                System.out.println("string is not palindrome");
                return;
            }
        }
        System.out.println("Sring is palindrome");
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        checkPalindrome(str1);

    }
}
