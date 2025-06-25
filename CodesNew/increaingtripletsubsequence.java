package CodesNew;

public class increaingtripletsubsequence {

    public static boolean callnums(int[] nums){


        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1; k<nums.length;k++){
                    if(nums[j]<nums[k] &&  nums[i] <nums[j]){
                        return true;
                    }
                }
            }
        }
        

        // // for(int i=1;i<=2;i++){
        // //     if(nums[i-1]<nums[i] &&  nums[i] <nums[i+1]){
        // //         return true;
        // //     }
        // }


        return false;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        boolean b = callnums(nums);
        System.out.println(b);
    }
}
