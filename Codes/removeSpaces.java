import java.util.Scanner;

public class removeSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Loviees Name");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        StringBuilder res = new StringBuilder();

        for(char c: ch){
            if(!Character.isWhitespace(c)){
            res.append(c);
            }
        }
        System.out.println("Love Is");
        System.out.println(res.toString());
    }
    
}
