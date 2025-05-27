package practiceallcodesTry1;

public class mergetwoarraysalsosort {
    public static void callarrmerge(int[] n1, int[] n2){
        int[] n3 = {};
        for(int i=0, j=0;i<n1.length-1||j<n2.length-1; i++,j++){
            n3[i] = n1[i] + n2[j];
        }
        System.out.println(n3);

        //Solve This
    }
    public static void main(String[] args) {
        int[] n1 = {1,4,1,6,8,3,};
        int[] n2 = {9,3,15,99,2,6};

        callarrmerge(n1,n2);
    }
}
