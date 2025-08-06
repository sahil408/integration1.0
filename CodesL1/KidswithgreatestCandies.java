package CodesL1;

import java.util.ArrayList;
import java.util.List;

public class KidswithgreatestCandies {
    public static void kidswithmaxcandies(int[] n, int ec) {
        int maxcandies = 0;

        for (int candies : n) {
            if (candies > maxcandies) {
                maxcandies = candies;
            }
        }

        List<Boolean> res = new ArrayList<>();

        //Way1
        // for(int i=0; i<n.length;i++){
        // res.add(n[i]+ec>maxcandies);
        // }

        //Way2
        for (int i = 0; i < n.length; i++) {
            if (n[i] + ec > maxcandies) {
                res.add(true);
            } else
                res.add(false);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] s = { 1, 0, 5, 6, 8, 3 };
        int ec = 4;
        kidswithmaxcandies(s, ec);
    }
}
