public class fibonnacinumber {
    public static void main(String[] args) {
        int n=15;
        int a=0;
        int b=1;

        System.out.println(recursive(10));
        
        //Iterative Method
        for(int i=1;i<=n;i++){
            int temp = a+b;
            a=b;
            b=temp;
        }
        System.out.println(a);
    }
        //Recursive Method
        public static int recursive(int n){
            if(n<=1){
                return n;
            }
            return recursive(n-1)+recursive(n-2);
            
        }



}
