
import java.util.Arrays;

public class productofarrayitself {
    public static int[] productExceptSelf(int[] nums) {
        int[] n = new int[nums.length];
        for(int i=0;i<n.length;i++){
            n[i] = pro1(i, nums) * pro2(i, nums);
        }
        return n;
    }


    public static int pro1(int i, int[] n){
        int temp =1;
        for(int j=i+1; j<n.length;j++){
            temp = temp * n[j];
        }

        return temp;

    }


    public static int pro2(int i, int[] n){

        int temp =1;
        for(int j=i-1; j>=0;j--){
            temp = temp * n[j];
        }

        return temp;
        
    }

     

    public static void main(String[] args) {
        int[] nums = {5,2,6,4};
        int[] rec = productExceptSelf(nums);
        System.out.println(Arrays.toString(rec));
    }
}
