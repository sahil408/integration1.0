
import java.util.Arrays;

public class productofarrayitselfOptimised {
    public static int[] productExceptSelf(int[] nums) {
        int[] n = new int[nums.length];

        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];

        pre[0] =1;
        suf[nums.length-1] = 1;
        for(int i=1; i< pre.length;i++){
            pre[i] = pre[i-1] * nums[i-1];
        }
        for(int i=nums.length-2; i>=0;i--){
            suf[i] = suf[i+1] * nums[i+1];
        }


        for(int i=0;i<n.length;i++){
            n[i] = pre[i] * suf[i];
        }
        return n;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,7,2};
        int[] rec = productExceptSelf(nums);
        System.out.println(Arrays.toString(rec));
    }
}
