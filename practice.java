

public class practice {

    public static int callfun(char[] ch){

        StringBuilder sb = new StringBuilder();

        int i=0;
        while(i<ch.length){
            char curr = ch[i];
            int count =0;

            while(i<ch.length && curr == ch[i]){
                i++;
                count++;
            }
            sb.append(curr);
            if(count>1){
                sb.append(count);
            }
        }
        for(int j=0; j<ch.length;j++){
            ch[j] = sb.charAt(j);
        }

        System.out.println(sb.toString());

        return sb.length();

    }

        
    

       
    public static void main(String[] args) {
       char[] ch = {'a','a','b','a','a','c','d','d'};
        int out = callfun(ch);
        System.out.println(out);

    }
}


