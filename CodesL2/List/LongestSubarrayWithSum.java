package CodesL2.List;
import java.util.*;

public class LongestSubarrayWithSum {

    public static List<Integer> longestSubarrayWithSum(int[] arr, int target) {
        int maxLen = 0;
        int start = -1, end = -1;
        // Try every subarray
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target && (j - i + 1) > maxLen) {
                    maxLen = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }
        List<Integer> subarray = new ArrayList<>();
        if (start != -1) {
            for (int i = start; i <= end; i++) {
                subarray.add(arr[i]);
            }
        }
        return subarray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;

        List<Integer> result = longestSubarrayWithSum(arr, target);
        System.out.println(result); // [2, 3, 4]
    }
}
