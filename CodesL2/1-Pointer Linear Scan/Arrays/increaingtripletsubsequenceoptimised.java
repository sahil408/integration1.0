
public class increaingtripletsubsequenceoptimised {

    public static boolean callnums(int[] nums){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num:nums){
            if(num<=first){
                first = num;
            }else if(num<=second){
                second = num;
            }else{
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1,6,9};
        boolean b = callnums(nums);
        System.out.println(b);
    }
}




// int first = Integer.MAX_VALUE;
// int second = Integer.MAX_VALUE;
// int i=0;
// while (i<n.length) {
//     if(first>=n[i]){
//         first = n[i];
//         i++;
//     }else if(second>=n[i]){
//         second = n[i];
//         i++;
//     }else{
//         return true;
//     }
// }
// return false;