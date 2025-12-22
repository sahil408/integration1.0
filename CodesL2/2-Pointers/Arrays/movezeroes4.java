
import java.util.Arrays;

public class movezeroes4 {

    public static void callmoveoptimised(int[] nums){
        int count =0;
        
        for(int i=0; i< nums.length;i++){
            if(nums[i]!=0){
                nums[count]= nums[i];
                count++;
            }
        }
        while(count<nums.length){
            nums[count] =0;
            count++;
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        callmoveoptimised(nums1);
    }
}
