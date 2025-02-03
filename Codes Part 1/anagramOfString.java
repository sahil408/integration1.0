import java.util.Arrays;
import java.util.Scanner;

public class anagramOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();

        if(checkAnagram(str1,str2)){
            System.out.println("Strings are anagram");
        }
        else{
            System.out.println("Strings are not Anagram");
        }
  
        }

        static boolean checkAnagram(String str1, String str2) {

            if(str1.length()!=str2.length()){
                return false;
            }
        
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            for(int i=0;i<ch1.length;i++){
                for(int j=0;j<ch1.length-i-1;j++){
                    if(ch1[j]>ch1[j+1]){
                        char temp = ch1[j];
                        ch1[j] = ch1[j+1];
                        ch1[j+1] = temp;
                    }
                }
            }

            //Arrays.sort(ch1);
            Arrays.sort(ch2);

            String newstr1 = new String(ch1);
            String newstr2 = new String(ch2);

            if(newstr1.equals(newstr2)){
                return true;
            }
            else{
                return false;
            }

        }
    }