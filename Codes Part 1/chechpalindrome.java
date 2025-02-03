public class chechpalindrome {
    public static void main(String[] args) {
        boolean res = true;
        String str = "Welcome home";
        int n= str.length();
        char[] ch = str.toCharArray();
        for(int i=0; i<n/2;i++){
            if(ch[i] != ch[n-i-1]){
                res=false;
                break;
            }
           
        }
        System.out.println(str+ " is palindrome: " +res);
    }
}
