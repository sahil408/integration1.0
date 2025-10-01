package CodesL2.Stacks;
import java.util.*;

public class NearestSmallerToLeftProblem {
    public static void main(String[] args) {
        int[] arr = {6, 5, 1, 4, 8, 4, 7, 9, 3};
        int[] result = nearestSmallerToLeft(arr);

        System.out.println(Arrays.toString(result));
    }

    public static int[] nearestSmallerToLeft(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop until we find a smaller element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            // Push current element to stack
            stack.push(arr[i]);
        }
        return res;
    }
}
