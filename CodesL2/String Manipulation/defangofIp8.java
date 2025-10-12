
public class defangofIp8 {

    public static void defangcall(String s) {
        String newIP = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '.') {
                newIP = newIP + "[.]";
            } else
                newIP = newIP + ch;
        }

        System.out.println(newIP);
    }

    public static void main(String[] args) {
        String s = "255.233.2.23";

        defangcall(s);
    }
}
