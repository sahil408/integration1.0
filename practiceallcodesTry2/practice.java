package practiceallcodesTry2;


public class practice {

    public static double callfun(int[] n, int k){
        int sum =0;

        for(int i=0;i<k;i++){
            sum = sum +n[i];
        }

        double max = sum;

        for(int i=k;i<n.length;i++){
            sum = sum - n[i-k] + n[i];
            max = Math.max(sum, max);

        }
        return max/k;
       
    }
    

       
    public static void main(String[] args) {
        int[] n = {2,4,7,8,5,-2,13};
        int k = 3;
        double b = callfun(n, k);
        System.out.println(b);
    }
}
