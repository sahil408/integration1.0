package CodesL2;

import java.util.Arrays;

public class movezeroes {

    public static void callmove(int[] nums){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
           
        }
        System.out.println(Arrays.toString(nums));

    }

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
        int[] nums = {0,1,0,3,12};
        int[] nums1 = {0,1,0,3,12};
        callmove(nums);
        callmoveoptimised(nums1);
    }
}
