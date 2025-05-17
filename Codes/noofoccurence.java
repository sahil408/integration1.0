public class noofoccurence {

    public static void occurence(String s) {

        // //One Solution is to replace character and equate final and initial string
        // This can be used if only asked us to count one charcter only
        // int old = s.length();
        // int newstring = s.replace("s", "").length();
        // int total = old - newstring;
        // System.out.println(old + " " + newstring+ " " +total);
        // To find the number of digits, small alphabats and large aphabats, we can simply use str.charAt(i) with ASCII values in if statement

        // To count number of occurence of each character in a string

        int len = s.length();
        do{
        int count = 0;
        char[] ch = s.toCharArray();
        

        for (int i = 0; i < ch.length; i++) {
            // char ch = s.charAt(i);
            if ( (ch[0] ==ch[i]) && ((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122) || (ch[i] >= 48 && ch[i] <= 57))) {
                count++;  
            }   
        }
        System.out.println("No of occurence of: " + ch[0] + ": " + count);
        s = s.replace("" + ch[0], "");
        //s = s.replace(String.valueOf(ch[0]), "");
        len = s.length();
    }
    while(len!=0);

    }

    public static void main(String[] args) {
        String s = "sahilkundansahil";
        occurence(s);
    }
}
