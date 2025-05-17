public class noofduplicatechars {
    public static void main(String[] args) {
        String s = "aab ccd eef%^&%#";
        int len = s.length();

        do{
            char[] ch = s.toCharArray();
            int count = 0;
            
            for(int i=0; i<s.length();i++){
                
                if( (ch[0] == ch[i]) && Character.isLetterOrDigit(ch[0]) ){
                   // if( (ch[0] == ch[i]) && !Character.isLetterOrDigit(ch[0]) ){              For Special Characters
                    count++;
                }
            }
                if(count>=2){
                    System.out.println(ch[0] + "times" + count);
                }
                s = s.replaceAll(Character.toString(ch[0]), "");
                len = s.length();
            
        }while(len!=0);
        
    }
}
