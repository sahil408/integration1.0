package CodesNew;
public class containerWithMostWater {

    public static int callwateroptfur(int[] n){
        int i=0;
        int maxArea = 0;
        int j=n.length-1;

        while(i<j){
                int height = Math.min(n[i], n[j]);
                int width = j-i;
                int area = height * width;
                maxArea = Math.max(maxArea, area);

                if(n[i]<n[j]){
                    i++;
                }else{
                    j--;
                }
            }
        return maxArea;
    }


    public static void main(String[] args) {
        int[] n = {1,8,6,2,5,4,8,3,7};
        int out = callwateroptfur(n);
        System.out.println(out);
        
    }
}
