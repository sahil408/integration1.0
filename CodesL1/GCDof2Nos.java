package CodesL1;

public class GCDof2Nos {

    public static void codegcdcall(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD is " + gcd);

    }

    public static int euclediancall(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    public static void lcmcall(int n1, int n2) {
        System.out.println("LCM is: " + (n1 * n2) / euclediancall(n1, n2));
    }

    public static int gcdArrEle(int[] a) {
        int result = a[0];

        for (int i = 1; i < a.length; i++) {
            result = euclediancall(result, a[i]);
        }
        return result;

    }

    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 9;

        codegcdcall(n1, n2);

        int n = euclediancall(n1, n2);
        System.out.println("GCD of No is " + n);

        lcmcall(n1, n2);

        int[] a = { 12, 48, 60 };

        int res = gcdArrEle(a);

        System.out.println("GCD of Array is " + res);

    }
}
