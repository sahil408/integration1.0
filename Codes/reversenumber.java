public class reversenumber {
    public static void main(String[] args) {
        
        // Reverse Number
        int num = 4321;
        int rev=0;

        while(num!=0){
            rev = rev*10 + num%10;
            num =num/10;
        }
        System.out.println(rev);


        //Reverse String
        String s= "abcd";
        String s1 = "";

        for(int i = s.length()-1; i>=0; i--){
            s1 = s1+ s.charAt(i);
        }
        System.out.println(s1);



        // Can reverse both digits and strings

        int newnum = 5678;
        String s3 = Integer.toString(newnum);
        
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(s).reverse());

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.append(s3).reverse());


    }
}
