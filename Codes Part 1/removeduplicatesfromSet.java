import java.util.HashSet;
import java.util.Set;

public class removeduplicatesfromSet {

    public static void main(String[] args) {
        Integer[] str = {1,2,2,3,4,4,4,5,6,7,8};

        Set<Integer> set = new HashSet<>();

        for(int i: str){
            set.add(i);
        }
        System.out.println(set);
    }
    
}
