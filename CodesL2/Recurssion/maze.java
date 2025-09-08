package CodesL2.Recurssion;

public class maze {
    public static int callmaze(int i, int j,int n, int m){
        if(i==n || j == m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int right = callmaze(i, j+1, n, m);
        int down = callmaze(i+1, j, n, m);

        int max = right + down;
        return max;
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int total = callmaze(0,0,n,m);
        System.out.println(total);
    }
}
