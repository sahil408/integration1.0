package CodesNew;

public class containerWithMostWater {

    public static int callwater(int[] n){
        int sum =0;

        int m = Integer.MIN_VALUE;
        for(int i: n){
            if(i>=m){
                m =i;
            }
        }
        for(int i=n.length-1;i>=0;i--){
            if(n[i]==m){
                sum = n[i] * m;
                break;
            }else if(n[i]==m-1){
                sum = n[i] * (m-1);
                break;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] n = {1,8,6,2,5,4,8,3,7};
        int out = callwater(n);
        System.out.println(out);
    }
}
