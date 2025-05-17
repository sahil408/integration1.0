import java.util.Scanner;

public class swappingStringsWo3rdVariable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd String");
        String str2= sc.nextLine();

        str1= str1+str2;
        str2 = str1.substring(0, str1.length()-str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("First String: " + str1 + " Second String: " + str2);

    }
}
