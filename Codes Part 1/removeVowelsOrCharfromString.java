import java.util.Scanner;

public class removeVowelsOrCharfromString {
    public static void main(String[] args) {
        String str = "Sahil Kundan";

        char[] ch = str.toCharArray();

        System.out.println("Type any character to remove from string");

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        char[] ch1 = str1.toCharArray();

       

        //char[] ch1 = {'a','e','i','o','u','A','E','I','O','U'};

        StringBuilder res = new StringBuilder();

        for(int i=0;i<ch.length;i++){
            boolean isVowel = false;
            for(int j=0;j<ch1.length;j++){
                if(ch[i]==ch1[j]){
                    isVowel = true;
                    break;
                }
            }
            if(!isVowel){
                res.append(ch[i]);
            }   
        }
        System.out.println(res.toString());
        sc.close();
    }
}
