
class numberofcharsinstring {
    public static void main(String[] args) {
        System.out.println("Program to count number of chars in array");

        String str = "";
        int len = str.length();

        do {
            try {
                if (str.isEmpty())
                    break;
                char[] ch = str.toCharArray();
                int count = 0;
                for (int i = 0; i < ch.length - 1; i++) {
                    if ((ch[0] == ch[i]) && ((ch[0] >= 65 && ch[0] <= 91) || (ch[0] >= 97 && ch[0] <= 123)))
                        count++;
                }
                if (count != 0) {
                    System.out.println(ch[0] + " " + count + " times");
                }
                str = str.replace("" + ch[0], "");
                len = str.length();
            } catch (Exception E) {
                System.out.println(E);
            }
        } while (len != 0);
    }
}