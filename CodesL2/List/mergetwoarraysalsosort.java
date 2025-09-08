package CodesL2.List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergetwoarraysalsosort {
    public static void callarrmerge(int[] n1, int[] n2){

        //Way1
        List<Integer> n3 = new ArrayList<>();
        int i=0, j=0;
        while(i<n1.length || j<n2.length){
            if(i<n1.length){
                n3.add(n1[i]);
                i++;
            }if(j<n2.length){
                n3.add(n2[j]);
                j++;
            }
        }
        Collections.sort(n3);
        System.out.println(n3);
    

    //Way2
        // int[] n = new int[n1.length+n2.length];

        // System.arraycopy(n1, 0, n, 0, n1.length);
        // System.arraycopy(n2, 0, n, n1.length, n2.length);

        // Arrays.sort(n);
        // System.out.println(Arrays.toString(n));

    }

    public static void main(String[] args) {
        int[] n1 = {1,4,1,6,8,3};
        int[] n2 = {9,3,15,99,2,6};

        callarrmerge(n1,n2);
    }
}
