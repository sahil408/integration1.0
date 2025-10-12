package CodesL2.Recurssion;


public class fibonaccinumber {

    public static void codecall(int n1, int n2, int k){
        if(k==0){
            return;
        }
        for(int i=0; i<k ; i++){
            int temp = n1 +n2;
            n1 = n2;
            n2 = temp;

            System.out.print(temp + " ");
        } 
    }
    public static void codecallrec(int n1, int n2, int k){
        if(k==0){
            return;
        }
        int temp = n1+n2;
        System.out.print(temp+ " ");
        codecallrec(n2, temp, k-1);
    }
    public static void main(String[] args) {
        int n1 =0;
        int n2 =1;
        int k = 21;
        System.out.print("Iterative: "+n1 + " " + n2+ " ");
        codecall(n1, n2, k);
        System.out.println();
        System.out.print("Recursive: " + n1 + " " + n2+ " ");
        codecallrec(n1, n2, k);
    }
}
