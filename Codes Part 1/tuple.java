public class tuple {
    public static void main(String[] args) {
        int[] l = {1,2,3,4,5};

        int s = 5;

        for(int i=0;i<l.length;i++){
            for(int j=i+1;j<l.length;j++){
                if(l[i]+l[j]==s){
                    System.out.println("(" +l[i] + "," +l[j]+ ")");
                }
            }
        }
    }
}
