public class permutation {

    public static void printPermutation(String s, String combination){
        if(s.length() == 0){
            System.out.println(combination);
            return;
        }

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);

            String newStr = s.substring(0, i) + s.substring(i+1);

            printPermutation(newStr, combination+ch);

        }

    }
    public static void main(String[] args) {
        String str = "abcd"; // Also write code to remove duplicates if possible

        printPermutation(str, "");


    }
}
