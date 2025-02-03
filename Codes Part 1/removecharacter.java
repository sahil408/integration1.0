import java.util.Scanner;

public class removecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your statement");
        String str = sc.nextLine();

        System.out.println("Enter the letter you want to remove");
        String ltr = sc.nextLine();
        char l = ltr.charAt(0);

        removeChar(str, l);
        removeCharsb(str, l);
        sc.close();
    }

    static void removeChar(String str, char c) {
        int j;
        int n = str.length();
        char[] t = str.toCharArray();
        int count = 0;
        for (int i = j = 0; i < n; i++) {
            if (t[i] != c)
                t[j++] = t[i];
            else
                count++;
        }
        while (count > 0) {
            t[j++] = ' ';
            count--;
        }
        System.out.println(t);

    }

    static void removeCharsb(String str, char c) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != c) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
