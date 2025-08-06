package CodesL1;

public class evenandodd {
    public static void evenandoddcall(int n){
        if(n<=0){
        System.out.println("Number is invalid " + n);
        }
        else if(n%2==0){
            System.out.println("Number is even " + n);
        }else{
            System.out.println("Number is Odd " + n);
        }
    }
    public static void optimisecall(int n){
        if(n<=0){
            System.out.println("Number is invalid");
        }else
            System.out.println("Given number is " + (n%2==0? "even " : "odd ") + n);
    }

    public static void main(String[] args) {
        int n = 42;
        evenandoddcall(n);
        optimisecall(n);
    }
}
