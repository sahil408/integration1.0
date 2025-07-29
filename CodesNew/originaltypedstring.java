package CodesNew;

// Input: word = "abbcccc"
// Output: 5
// Explanation:
// The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc".

public class originaltypedstring {
    static int callcode(String s) {
        if(s.length()==0){
            return 0;
        }
        int count = 1;
        int i=0;

        while(i<s.length()){
            int j = i+1;
            while(j < s.length() && s.charAt(i) == s.charAt(j)){
                j++;
            }
            int len = j-i;
            if(len>1){
                count = count + (len-1);
            }
            i=j;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abbcccc";
        System.out.println(callcode(s));
    }
}

