public class elemntsClosestToZero {
    public static void main(String[] args) {
        int[] number = {-1,-4,-9,-8,-3,-2,-2,2,-6,-10};

        int closest = Integer.MAX_VALUE; //5

        for(int i=0; i<number.length;i++){
            int currentNo = number[i]<0 ? -number[i] : number[i];  //5 -> 5, -4, 9
            int closestNo = closest<0 ? -closest : closest;  //5, 5, -4, 

            if((currentNo < closestNo) || ((currentNo==closestNo) && (number[i]>closest))){
                closest = number[i];
            }
        }
        System.out.println(closest);
    }
}

//number[i]>closest) -> This is used to print the positive number in case of tie

