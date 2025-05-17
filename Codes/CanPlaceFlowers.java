
public class CanPlaceFlowers {
    public static Boolean plotting(int[] n, int f) {
        int count =0;

        StringBuilder sb = new StringBuilder();
        sb.append('0');
        for(int i:n){
            sb.append(i);
        }
        sb.append('0');

        for(int i=1;i<sb.length()-1;i++){
            if(sb.charAt(i-1)=='0' && sb.charAt(i)=='0' && sb.charAt(i)=='0'){
                sb.setCharAt(i, '1');
                count++;
            }
            if(count>=f){
                return true;
            }
        }


       return count>=f;

    }

    public static void main(String[] args) {
        
        int[] fb = {1,0,1,1,0,1,0,0,0,0,0,0,0};

        int n=3;

        boolean canplaceflo = plotting(fb, n);
        System.out.println(canplaceflo);
    }
}
