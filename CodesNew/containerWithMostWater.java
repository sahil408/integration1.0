package CodesNew;

public class containerWithMostWater {

    public static int callwater(int[] n){
        int sum =0;

        int m = Integer.MIN_VALUE;
        for(int i: n){
            if(i>=m){
                m =i;
            }
        }
        for(int i=n.length-1;i>=0;i--){
            if(n[i]==m){
                sum = n[i] * m;
                break;
            }else if(n[i]==m-1){
                sum = n[i] * (m-1);
                break;
            }
        }
        return sum;
    }


    public static int callwateropt(int[] n){
        int i=0;
        int sum = 0;

        while(i<n.length){
            for(int j=n.length-1;j>=0;j--){
                if(n[i]>=n[j] && i<j && (n[j]*(j-i)>=sum)){
                    sum = n[j] * (j-i);
                }else if(n[i]<n[j] && i<j && (n[i]*(j-i)>=sum)){
                    sum = n[i] * (j-i);
                }
            }
            i++;
        }
        return sum;
    }



    public static void main(String[] args) {
        int[] n = {1,8,6,2,5,4,8,3,7};
        int[] n1 = {4,3,2,1,4};
        int out = callwater(n);
        System.out.println(out);
        int out1 = callwateropt(n1);
        System.out.println(out1);
    }
}
