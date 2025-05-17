

public class numberisprime2 {

    public static boolean noisprime(int n) {

        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        /*
         * Scanner scanner = new Scanner(System.in);
         * 
         * int n1 = scanner.nextInt();
         * 
         * boolean result = noisprime(n1);
         * 
         * if(result){
         * System.out.println(n1 + "Number is prime");
         * }
         * else{
         * System.out.println(n1 + "Number is not prime");
         * }
         * 
         * 
         * scanner.close();
         */

        // Can try below as well

        System.out.println("Number is prime or not");

        int n = 55;
        int count = 0;

        if (n <= 1) {
            System.out.println(n + " Number is not prime");
        }
        if (n == 2) {
            System.out.println(n + " Number is prime");
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println(n + " Number is prime");
        } else {
            System.out.println(n + " Number is not prime");
        }

    }
}

/*
 * 1. Efficiency:
 * ○ By checking for factors only up to the square root of n, you significantly
 * reduce the number of iterations needed to determine if n is prime.
 * ○ For example, for n = 100, the square root of 100 is 10. So, you only need
 * to check divisors from 2 to 10, instead of from 2 to 50 if you were checking
 * up to n/2.
 * This reduces the time complexity of the algorithm from O(n/2)O(n/2)O(n/2) to
 * O(n)O(\sqrt{n})O(n), which is a significant improvement, especially for
 * larger values of n.
 */
