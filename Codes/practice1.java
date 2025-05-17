
public class practice1 {
    public static void closesttozero(int[] n) {

        int closest = Integer.MAX_VALUE;

        for(int i=0; i<n.length;i++){

            for(int num: n){
                int absvalue = Math.abs(num);
                if(absvalue < closest){
                    closest = num;
                }
            }
            
        }
        System.out.println(closest);

       
    }
    public static void main(String[] args) {
        int[] number = {-1,-4,-9,-8,-3,-2,-2,2,-6,-10};
        closesttozero(number);

    }
}
