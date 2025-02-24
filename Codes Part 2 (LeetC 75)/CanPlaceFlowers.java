import java.lang.reflect.Array;

public class CanPlaceFlowers {

    public static boolean flowersPlacement(int[] fb, int n){
        int count =0;

        StringBuilder sb = new StringBuilder();

        sb.append('0');

        for(int i: fb){
            sb.append(i);
        }
        sb.append('0');

        for(int i=1;i<sb.length()-1;i++){
            if(sb.charAt(i-1) == '0' && sb.charAt(i)== '0' && sb.charAt(i+1)=='0'){
                sb.setCharAt(i, '1');
                count++;

                if(count>=n) {return true;} // count matlab agr count jitni jgh hogi tbi n aayega, usse km mae n nhi ayega

            }

        }
        return count>=n;

    }
    public static void main(String[] args) {
        // 605. Can Place Flowers
        // Easy
        // Topics
        // Companies
        // You have a long flowerbed in which some of the plots are planted, and some
        // are not. However, flowers cannot be planted in adjacent plots.

        // Given an integer array flowerbed containing 0's and 1's, where 0 means empty
        // and 1 means not empty, and an integer n, return true if n new flowers can be
        // planted in the flowerbed without violating the no-adjacent-flowers rule and
        // false otherwise.


        int[] a = {0,1,0};

        int n= 1;

        int n1 =0;

        for(int i : a){
            if(i==1){
                n1 = n1 + 1;
            }
        }

        Boolean b = true;


        if((a.length%2==0) && ((n1+n)<=(a.length/2))){
            System.out.println(b);
        }
        else if((a.length%2!=0) && ((n1+n)<=((a.length+1)/2))){
            System.out.println(b);
        }
        else{
            System.out.println(!b);
        }

        boolean canPlace =  flowersPlacement(a,n);
        System.out.println(canPlace);

    }
}
