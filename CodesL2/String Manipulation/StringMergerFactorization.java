


public class StringMergerFactorization {
    public static int overlapSuffixPrefix(String s1, String s2){
        int maxoverlap = 0;
        int minlen= Math.min(s1.length(), s2.length());

        for(int i=1; i<= minlen; i++){
            if(s1.substring(s1.length()-i).equals(s2.substring(0,i))){
                maxoverlap = i;
            }
        }
        return maxoverlap;
    }

    public static String callmergerfunc(String s1, String s2){
        int overlap1 = overlapSuffixPrefix(s1, s2);
        String merged1 = s1 +s2.substring(overlap1);


        int overlap2 = overlapSuffixPrefix(s2, s1);
        String merged2 = s2 + s1.substring(overlap2);

        return merged1.length()<= merged2.length() ? merged1 : merged2;  // In this less the overlap more big is the string, so doesn't matter the size of the string, more the overlap more factor
    }
    public static void main(String[] args) {
        String s1 = "teas1234";
        String s2 = "1234spn";
        String s = callmergerfunc(s1, s2);
        System.out.println(s);

    }
}
