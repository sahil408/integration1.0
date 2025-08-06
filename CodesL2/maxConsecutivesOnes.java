package CodesL2;

public class maxConsecutivesOnes {

    public static int codeConOne(int[] nums, int k){
        //works only in case of finding in consecutive 1's
        
        int cc = 0;
        int maxC = 0;

        for(int n:nums){
            if(n==1){
                cc++;
            }else{
                maxC = Math.max(maxC, cc);
                cc =0;
            }
        }
        maxC = maxC +k;
        return maxC;
    }

    public static int codeConOneOpt(int[] nums, int k){
        int left = 0;
        int maxC = 0;

        int zeroes =0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zeroes++;
            }
            
            while (zeroes >k) {
                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }

            maxC = Math.max(maxC, right-left+1);
        }
        return maxC;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,0,1,1,1,1,0};
        int k = 2;
        int out = codeConOneOpt(nums, k);
        System.out.println(out);
    }
}
