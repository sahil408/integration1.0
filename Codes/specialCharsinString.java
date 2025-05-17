
public class specialCharsinString {

    public static void findspecials(String s) {
        int count = 0;
        char[] ch = s.toCharArray();
        int n = ch.length;
        System.out.println(n);

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetterOrDigit(ch[i])== false) {
                count++;
            }
        }
        System.out.println("No of Special Chars: " +  count);
    }

    public static void main(String[] args) {
        String s = "bdhsd@#%23832@";
        findspecials(s);
    }
}
