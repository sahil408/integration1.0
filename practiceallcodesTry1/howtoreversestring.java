package practiceallcodesTry1;

public class howtoreversestring {

    public static void callrevstr(String str) {
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

    public static void callrevstrTC(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
            char temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
        }
        System.out.println();
        System.out.println(ch);
    }

    public static void callletsrev(String str) {
        String[] s = str.split(" ");
        System.out.println(str);
        for (int k = 0; k < s.length; k++) {
            char[] ch = s[k].toCharArray();
            for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
                char temp = ch[j];
                ch[j] = ch[i];
                ch[i] = temp;
            }
            System.out.print(ch);
            System.out.print(" ");
        }

    }

    public static void main(String[] args) {
        String str = "sahil";
        callrevstr(str);
        callrevstrTC(str);

        String str1 = "Lets Reverse It";
        callletsrev(str1);

    }
}
