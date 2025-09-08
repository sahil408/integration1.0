import java.util.Arrays;

public class practice {
    public static void callmoveoptimised(int[] n){

        int count =0;

        for(int i=0; i<n.length;i++){
            if(n[i]!=0){
                n[count] = n[i];
                count++;
            }
        }
            while(count<n.length){
                n[count]=0;
                count++;
            }
        
       System.out.println(Arrays.toString(n));
        
    }
    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        callmoveoptimised(nums1);
    }
}


