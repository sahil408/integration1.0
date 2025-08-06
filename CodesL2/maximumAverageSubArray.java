package CodesL2;

public class maximumAverageSubArray {

    public static double callAvSub(int[] n, int k){
        int left =0;
        int right = 0;
        double av =0;
        double sum =0;
        double max=Double.NEGATIVE_INFINITY;

        while (left<=n.length-k) {
            sum =0;
            right=left;
            while(right<left + k){
                sum = sum + n[right];
                right++;
            }
            av = sum/k;
            max = Math.max(max, av);
            left++;
        }

        return max;
    }

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
        // double b = callAvSub(n,k);
        // System.out.println(b);
        double b = callAvSubOpt(n,k);
        System.out.println(b);
    }
}
                           

// public static double callAvSub(int[] n, int k){
//     double sum = 0;
//     for(int i = 0; i < k; i++){
//         sum += n[i];
//     }

//     double max = sum;

//     for(int i = k; i < n.length; i++){
//         sum = sum - n[i - k] + n[i]; // remove left, add right
//         max = Math.max(max, sum);
//     }

//     return max / k;
// }

