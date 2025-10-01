package CodesL2.SlidingWindow;

public class maximumAverageSubArray {

    public static double callAvSubOpt(int[] n, int k){
        double sum =0;

        for(int i=0;i<k;i++){
            sum = sum + n[i];
        }

        double max=sum;

        for(int i=k;i<n.length;i++){
            sum = sum -n[i-k] + n[i];
            max = Math.max(max, sum);
        }

        return max/k;
            
        }

    
    public static void main(String[] args) {
        int[] n = {1,12,-5,-6,50,3};
        int k=4;
        double b = callAvSubOpt(n,k);
        System.out.println(b);
    }
}
                           



