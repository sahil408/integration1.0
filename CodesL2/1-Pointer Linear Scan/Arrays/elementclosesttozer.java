
public class elementclosesttozer {
    public static void closestcall2ndWay(int[] n){
      int closest = n[0];

        for(int num : n){
            if(Math.abs(num)<Math.abs(closest) ||
                (Math.abs(num)==Math.abs(closest) && num<closest)){
                    closest = num;
                }
        }
        System.out.println("Closest to Zero:" + closest);
        // To print Negative closes just change num<closest  
    }
    public static void main(String[] args) {
        int[] n = {4,-2,5,3,2,-3,5};
        closestcall2ndWay(n);
    }
}














// int closest = Integer.MAX_VALUE;
//         for(int i=0; i<n.length;i++){
//           int current = n[i]<0 ? -n[i]: n[i];  //   4 ----- -2->2----- 5------- 3 -----  2 ------
//           int closestNo = closest<0 ? -closest:closest; //  max ----- 4----- 2 ---- 2 ------- 2 ------
//           if((current<closestNo) || ((current == closest) && n[i]>closestNo)){ //  4<max ----- 2<4 ----- NO ----- NO---- 2>-2 -----
//             closest = n[i];     // 4 ---- -2 ------ NO ---- NO----- 2------
//           }
//         }
//         System.out.println(closest);