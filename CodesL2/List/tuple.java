package CodesL2.List;

import java.util.ArrayList;
import java.util.List;

public class tuple {

    public static void calltuple(int[] n, int sum) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] + n[j] == sum) {
                    System.out.println(n[i] + "," + n[j]);
                }
            }

        }
    }
    public static void savingarraylist(int[] n, int sum) {
        List<int[]> ls = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] + n[j] == sum) {
                    ls.add(new int[]{n[i], n[j]});
                }
            }
        }
        for(int[] k: ls){
            System.out.println(k[0] + "," + k[1]);
        }
    }

    public static void main(String[] args) {
        int[] n = { 1, 4, 7, 3, 5, 0 };
        int sum = 5;

        calltuple(n, sum);
        savingarraylist(n,sum);
    }

}
