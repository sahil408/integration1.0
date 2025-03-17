
public class evenandodd {
    public static void newCode(int n) {
        if (n<0 || n==0) {
            System.out.println("number either 0 or less than that");
        }
       else if(n%2==0){
        System.out.println("even");
       }else
       System.out.println("odd");
       
    }
    public static void main(String[] args) {
       int num=  -232326723;
       newCode(num);    
    }
}
