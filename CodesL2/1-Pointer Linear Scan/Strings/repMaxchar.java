
public class repMaxchar {

    public static void callfun(String s){
        int count =1;
        int maxlen =1;
        char maxChar = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                count =1;
            }
            if(count>maxlen){
                maxlen = count;
                maxChar = s.charAt(i);
            }
        }
        System.out.println(maxChar + " repeats " + maxlen + " times");
    }

    public static void main(String[] args) {
        String s = "aabcddddeff";
        callfun(s);
    }
}
