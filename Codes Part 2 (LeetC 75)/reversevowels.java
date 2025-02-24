public class reversevowels {

    public static String method1(String str){



        return str;

    }
    public static void main(String[] args) {
        
        String str = "icecream";

        char[] ch = str.toCharArray();


        method1(str);
       // System.out.println(str);

        StringBuilder sb = new StringBuilder();

        // for(char i: ch){
        //     sb.append(i);
        // }

        String str1 = "";


        for(int i=0; i<ch.length; i++){
            if(ch[i]== 'i' || ch[i]== 'e' || ch[i]== 'a' || ch[i]== 'o' || ch[i]== 'u'){
                str1 = str.replace(ch[i], '_');
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);
        System.out.println(str1);
    }
}
