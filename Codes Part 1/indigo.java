import java.util.Scanner;

public class indigo {
    public static void main(String[] args) {
        System.out.println("Print your line\n");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = "#IndiabyIndigo";

        String[] str3 = str1.split(" ");

        /*for(String s: str3){
            System.out.println(s);
        } */

        for(int i=1;i<str3.length;i++){
            System.out.print(str3[i] + " ");
        }
        System.out.print(str2);
        sc.close();
    }
}
