
import java.util.Arrays;

public class productofarrayitselfOptimised {
    public static int[] productExceptSelf(int[] nums) {

     int len = nums.length;
     int[] n = new int[len];
     int[] p = new int[len];
     int[] s = new int[len];

     p[0]=1;
     s[nums.length-1]=1;

     for(int i=1; i<len; i++){
        p[i] = p[i-1] * nums[i-1];
     }
     for(int i=len-2; i>=0;i--){
        s[i] = s[i+1] * nums[i+1];
     }

     for(int i=0;i<len;i++){
        n[i] = p[i] * s[i];
     }

     return n;

    }
    public static void main(String[] args) {
        int[] nums = {3,6,7,2};
        int[] rec = productExceptSelf(nums);
        System.out.println(Arrays.toString(rec));
    }
}




// int n = nums.length;
// int[] result = new int[n];

// // Step 1: Prefix product
// result[0] = 1;
// for (int i = 1; i < n; i++) {
//     result[i] = result[i - 1] * nums[i - 1];
// }

// // Step 2: Suffix product and multiply in same array
// int suffix = 1;
// for (int i = n - 1; i >= 0; i--) {
//     result[i] = result[i] * suffix;
//     suffix *= nums[i];
// }

// return result;