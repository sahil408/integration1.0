public class maze {

    public static int totalPaths(int i, int j, int m, int n){

        if(i==m || j==n){
            return 0;
        }

        if(i==m-1 && j== n-1){
            return 1;
        }

        int rightPaths = totalPaths(i, j+1, m, n);
        int downPaths = totalPaths(i+1, j, m, n);

        int totalPaths = rightPaths+downPaths;
        return totalPaths;
    }

    public static void main(String[] args) {
        int n= 3, m=3;
        int total = totalPaths(0, 0, m, n);
        System.out.println(total);
    }
    
}
