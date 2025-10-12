
public class noisprime {
    public static void callprime(int n){
        if(n<=1){
            System.out.println("Number is not prime");
        }else if(n==2){
            System.out.println("Number is prime");
        }
        //2nd Way
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }
    public static void main(String[] args) {
        int n = 17;
        callprime(n);
    }
}









 // 1st Way
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     System.out.println("Number is prime");
        // }
        // else
        //     System.out.println("Number is not prime");
