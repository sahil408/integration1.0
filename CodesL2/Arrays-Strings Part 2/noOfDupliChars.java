

public class noOfDupliChars {
    public static void calldupli(String s){
        int len = s.length();
       
       do{
         char[] ch = s.toCharArray();
         int count =0;
         for(int i=0;i<ch.length;i++){
            if(ch[0] == ch[i] && (Character.isLetterOrDigit(ch[0]) || !Character.isLetterOrDigit(ch[0]))){
                count++;
            }
        }
            if(count>=0){
                System.out.println(ch[0] + " " + count);
            }
            s=s.replaceAll(Character.toString(ch[0]), "");
            len = s.length();

        }while(len!=0);
    }
    public static void main(String[] args) {
        String s = "aaabbbdddy6yys@ssppppp";
        calldupli(s);
    }
}
