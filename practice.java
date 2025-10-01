
public class practice {
    public static int callfun(String s1, String s2){

        int overlap =0;
        int minLen = Math.min(s1.length(), s2.length());
        for(int i=1; i<=minLen; i++){
            if(s1.substring(s1.length()-i).equals(s2.substring(0, i))){
                overlap =i;
            }
        }
        return overlap;
    }

    public static String callmergefun(String s1, String s2){
        int overlap1 = callfun(s1, s2);
        String merged1 = s1 + s2.substring(overlap1);

        int overlap2 = callfun(s2,s1);
        String merged2 = s2+ s1.substring(overlap2);

        return merged1.length()<= merged2.length() ? merged1 : merged2;
    }
    public static void main(String[] args) {
       String s1 = "1234teas";
       String s2 = "spoon1234";

       String s = callmergefun(s1, s2);
       System.out.println(s);
    }
}


