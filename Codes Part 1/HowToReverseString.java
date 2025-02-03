class reverseString {

    static void reverseStr(String str) {
        int n = str.length();
        char[] ch = str.toCharArray();
        char temp;

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        System.out.println(ch);
    }

    public static void main(String[] args) {

        String str = "sahil";
        reverseStr(str);

        System.out.println("Reversing only words of String");
        String s = "Lets Reverse Again";
        String[] s1 = s.split(" ");
        int n1 = s1.length;

        for (String temp : s1) {
            System.out.println(temp);
        }
        System.out.println(n1);

        for (int i = 0; i < n1; i++) {
            char[] ch = s1[i].toCharArray();
            for (int j = ch.length - 1; j >= 0; j--) {
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }

    }
}
