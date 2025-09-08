
public class romanToNumberConversion {

    public static int callIntConv(String s){

        int res =0;

       for(int i=0;i<s.length();i++){

            int s1 = values(s.charAt(i));
            if(i+1<s.length()){
                int s2 = values(s.charAt(i+1));
                if(s1>=s2){
                    res = res + s1;
                }else{
                    res = res + (s2-s1);
                    i++;
                }
            }else{
                res = res + s1;
            }

        }
        return res;

    }

    static int values(int n){
        if(n=='I'){
            return 1;
        }
        if(n=='V'){
            return 5;
        }
        if(n=='X'){
            return 10;
        }
        if(n=='L'){
            return 50;
        }
        if(n=='C'){
            return 100;
        }
        if(n=='D'){
            return 500;
        }
        if(n=='M'){
            return 1000;
        }
        return -1;
    }

    


    public static void main(String[] args) {
        String s = "VIII";
        int n = callIntConv(s);
        System.out.println(n);
    }
}
