
public class evenandodd {
    public static void optimisecall(int n) {
        if (n <= 0) {
            System.out.println("Number is invalid");
        } else
            System.out.println("Given number is " + (n % 2 == 0 ? "even " : "odd ") + n);
    }

    public static void main(String[] args) {
        int n = 42;
        optimisecall(n);
    }
}
