package CodesL1;

public class numberclosesttozero {

    public static void callclosest(int[] n){
        int maxclo = Integer.MAX_VALUE;

        for(int i=0;i<n.length;i++){
            int current = n[i]<0?-n[i]: n[i];
            int closest = maxclo<0?-maxclo: maxclo;
            if((current<closest)  ){
                maxclo = n[i];
            }
        }
        System.out.println(maxclo);

    }
    public static void main(String[] args) {
        int[] n1 = {2,-2,4,5,6,9,2,-4,-1,1};
        callclosest(n1);
    }
}
