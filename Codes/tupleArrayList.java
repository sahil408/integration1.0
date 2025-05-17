import java.util.ArrayList;
import java.util.List;

public class tupleArrayList {
    public static void main(String[] args) {
        int[] l = {1,2,3,4,5};

        int s = 5;

        List<int[]> ls = new ArrayList<>();

        for(int i=0;i<l.length;i++){
            for(int j=i+1;j<l.length;j++){
                if(l[i]+l[j]==s){
                    //System.out.println("(" +l[i] + "," +l[j]+ ")");
                    ls.add(new int[]{l[i],l[j]});
                }
            }
        }
        System.out.println("Sum of Integers " + s);
        for(int[] sa: ls){
            System.out.println("(" + sa[0] + "," + sa[1] +")");
        }
    }
}
