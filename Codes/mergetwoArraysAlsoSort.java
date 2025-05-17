import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class mergetwoArraysAlsoSort {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,2};
        int[] b = {4,5,6,1,3};

        // Arrays.sort(a);
        // Arrays.sort(b);

        int[] merged = new int[a.length+b.length];

        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));

        // Now remove duplicates from Array

        Set<Integer> s = new HashSet<>();

        for(int i: merged){
            s.add(i);
        }
        System.out.println(s);

        // If you want to store the array in sorted order use (Set<String> s = new TreeSet<>();)




    }
}
