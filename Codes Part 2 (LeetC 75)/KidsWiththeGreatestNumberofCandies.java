import java.lang.reflect.Array;
import java.util.Arrays;

public class KidsWiththeGreatestNumberofCandies {

    public static void main(String[] args) {
        int[] kids1 = { 2, 4, 5, 6, 1, 3, 4, 0};
        int[] kids = Arrays.copyOf(kids1, kids1.length);
        int max = 0;
        int extraC = 4;
        boolean b = true;
        for (int i = 0; i < kids.length; i++) {
            for (int j = i + 1; j < kids.length; j++) {
                if (kids[i] <= kids[j]) {
                    max = kids[j];
                    kids[j] = kids[i];
                    kids[i] = max;
                }
            }
        }
        int newmax = kids[0];
        int[] result = new int[kids.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = kids1[i] + extraC;
            if (result[i] >= newmax) {
                System.out.println(b);
            } else {
                System.out.println(!b);
            }
        }

    }

}
