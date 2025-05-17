public class number {
    public static void main(String[] args) {
        String str = "lets count the number of Chars in String";
        int len = str.length();
        
        do{
            char[] ch = str.toCharArray();
            int count =0;
        for(int i=0;i<ch.length-1;i++){
            //System.out.println(ch[i]);
            if((ch[0]==ch[i]) && ((ch[0]>=65 && ch[0]<=91) || (ch[0]>=97 && ch[0]<=123))){
                count++;
            }
        }
            if(count != 0){
                System.out.println("Char " + ch[0] + " "+count+" times");
            }
            str = str.replace("" + ch[0], "");
            len = str.length();       
    }
    while(len != 0);
    }
}
