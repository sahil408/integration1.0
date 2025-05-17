public class keypad {

    public static String[] keypad = {".", "abc", "def", "ghi","jkl", "mno", "pqrs","tu","vwx","yz"};

    public static void printCombination(String str, int idx, String combination){

        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);

        String s = keypad[currChar-'0'];

        for(int i=0; i<s.length();i++){
            printCombination(str, idx+1, combination+s.charAt(i));
        }

    }

    public static void main(String[] args) {
        String s= "23";
        printCombination(s, 0, "");


    }
    
}
