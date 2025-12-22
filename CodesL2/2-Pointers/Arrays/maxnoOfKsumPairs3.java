
import java.util.Arrays;
public class maxnoOfKsumPairs3 {

    public static int callpairsarrLOpt(int[] n, int k){
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        int count =0;
        int left =0;
        int right = n.length-1;
    
        while(left<right){
            int sum = n[left]+n[right];
            if(sum==k){
                count++;
                left++;
                right--;
            }else if(sum<k){
                left++;
            }else{
                right--;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] n = {6,4,3,2};
        int k = 6;
        int out = callpairsarrLOpt(n, k);
        System.out.println(out);


    }
}












// public static int callpairsarrL(int[] n, int k){
//     ArrayList<Integer> arrL = new ArrayList<>();
//     for(int a: n){
//         arrL.add(a);
//     }
//     int count =0;
//     if(n.length==0){
//         return 0;
//     }
//     int i=0;
//     while(i<arrL.size()){
//         int j=i+1;
//         boolean foundpair = false;
//         while(j<arrL.size()){
//             if((arrL.get(i)+arrL.get(j)==k)){
//                 count++;
//                 arrL.remove(j);
//                 arrL.remove(i);
//                 i=0;
//                 foundpair = true;
//                 break;
//             }
//             j++;
//         }
//         if(!foundpair){
//             i++;
//         }
//     }
//     return count;
// }
