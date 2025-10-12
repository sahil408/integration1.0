
public class howtoreversestring9 {

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
    public static void callletsrevusingBuilder(String s){
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=str.length-1;i>=0;i--){
            char[] ch = str[i].toCharArray();
            for(int j=0,k=ch.length-1;j<k;j++,k--){
                 char temp = ch[k];
                 ch[k] = ch[j];
                 ch[j] = temp;
            }
            sb.append(ch).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "sahil";
        callrevstrTC(str);

        String str1 = "Lets Reverse It";
        callletsrev(str1);
        callletsrevusingBuilder(str1);

    }
}











// public static void callrevstr(String str) {
//     char[] ch = str.toCharArray();
//     for (int i = ch.length - 1; i >= 0; i--) {
//         System.out.print(ch[i]);
//     }
// }