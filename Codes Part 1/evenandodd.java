// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class evenandodd {
    public static void main(String[] args) {
        System.out.println("Number is prime or not");
        int n = 0;

        if (n % 2 == 0 || n == 2) {
            System.out.println("Number is prime");
        } else if (n <= 1 || n % 2 != 2) {
            System.out.println("Number is not prime");
        }
    }
}
