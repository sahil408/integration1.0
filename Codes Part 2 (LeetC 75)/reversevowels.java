public class reversevowels {

    public static String revString(String str){

        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();


        for (int i = ch.length-1; i >= 0; i--) {
            if (isVowel(ch[i])) {
                sb.append(ch[i]);
                ch[i] = '_';
            }
        }
        int index = 0;
        for(int i=0; i<ch.length;i++){
            if(ch[i] == '_'){
            ch[i] = sb.charAt(index++);
            }
        }
        return new String(ch);
    }

    private static boolean isVowel(char ch){
            return "aeiouAEIOU".indexOf(ch) != -1;
    }
    

    public static void main(String[] args) {
        String str = "icecream";
        str = revString(str);
        System.out.println(str);
        
    }
}
