package practiceallcodesTry1;

public class elementclosesttozer {

    public static void closestcall1stWay(int[] n){
        int temp =0;
        for(int i=0; i<n.length-1;i++){
            for(int j=i+1; j<=n.length-1;j++){
                if(n[i]>=n[j]){
                    temp = n[j];
                    n[j]=n[i];
                    n[i] = temp;
                }
            }
        }
        for(int i=1;i<n.length;i++){
            if(n[0]== -n[i] ){
                n[0] = n[i];
            } 
        }
        System.out.println("Closest to zero is " + n[0] );
    }

    public static void closestcall2ndWay(int[] n){
        int closest = Integer.MAX_VALUE;

        System.out.println(closest);

        for(int i=0; i<n.length;i++){
          int current = n[i]<0 ? -n[i]: n[i];  //   4 ----- -2->2----- 5------- 3 -----  2 ------
          int closestNo = closest<0 ? -closest:closest; //  max ----- 4----- 2 ---- 2 ------- 2 ------

          if((current<closestNo) || ((current == closest) && n[i]>closestNo)){ //  4<max ----- 2<4 ----- NO ----- NO---- 2>-2 -----
            closest = n[i];     // 4 ---- -2 ------ NO ---- NO----- 2------
          }
        }
        System.out.println(closest);

    }
    public static void main(String[] args) {
        int[] n = {4,-2,5,3,2,-3,5};
        closestcall1stWay(n);
        closestcall2ndWay(n);
    }
}
