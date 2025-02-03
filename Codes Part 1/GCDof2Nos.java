import java.util.Scanner;

public class GCDof2Nos {

    public static int findgcdofno(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;

    }

    public static int findgcdofstringno(String s1,String s2){

        int n1 = s1.length();
        int n2 = s2.length();

        while (n2!=0) {
            int temp = n2;
            n2 =n1%n2;
            n1 = temp;
        }
        return n1;
    }

    public static String findgcdofstring(String s1,String s2){

        int n = findgcdofstringno(s1, s2);

        String gcdSubString = s1.substring(0, n);

        if(s1.equals(repeatString(gcdSubString, s1.length()/n)) && s2.equals(repeatString(gcdSubString , s2.length()/n))) {
            return gcdSubString;
        } 

        return "";
    }

    public static String repeatString(String str, int times){

        return str.repeat(times);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number");
        // int n1 = sc.nextInt();
        // System.out.println("Enter second number");
        // int n2 = sc.nextInt();

        // sc.nextLine();

        System.out.println("Enter first name");
        String str1 = sc.nextLine();
        System.out.println("Enter second name");
        String str2 = sc.nextLine();

        //Problem 1: GCD of numbers
        // int gcd = findgcdofno(n1,n2);
        // System.out.println("GCD of " + n1 + " and " + n2 + " is : " + gcd);


        //Problem 2: GCD of Strings
        String str = findgcdofstring(str1,str2);
        System.out.println("GCD of " + str1 + " and " + str2 + " is : " + str);

        sc.close();
    }
}
