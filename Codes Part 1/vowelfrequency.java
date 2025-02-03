import java.util.Scanner;

public class vowelfrequency {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         String str = sc.nextLine();
         int a=0, e=0, i=0, o=0, u=0;
         String s= str.toLowerCase();
         char[] ch = s.toCharArray();
         
         for(int j=0;j<s.length();j++){
            
            if (ch[j]=='a') { ++a;}
            else if (ch[j]=='e') { ++e;}
            else if (ch[j]=='i') { ++i;}
            else if (ch[j]=='o') { ++o;}
            else if (ch[j]=='u') { ++u;}
         }
         System.out.println("a --->" +a);
         System.out.println("e --->" +e);
         System.out.println("i --->" +i);
         System.out.println("o --->" +o);
         System.out.println("u --->" +u);

         sc.close();

    }
}
 // there is not much difference in ++a or a++ :> if we want to use incremented value in next statement then we do a++