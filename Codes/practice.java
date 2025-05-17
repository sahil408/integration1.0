import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class practice {
    public static void main(String[] args) {
        // merge two arrays

        String[] fruit = { "Apple", "Banana", "Mango" };
        String[] vegies = { "Cucumber", "Onion", "Tomato","Mango" };

        String[] mergedString = new String[fruit.length + vegies.length];

        System.arraycopy(fruit, 0, mergedString, 0, fruit.length);
        System.arraycopy(vegies, 0, mergedString, fruit.length, vegies.length);
        Arrays.sort(mergedString);
        System.out.println(Arrays.toString(mergedString));

        Set<String> s = new TreeSet<>();

        for (String i : mergedString) {
            s.add(i);
        }
        System.out.println(s);

    }
}
