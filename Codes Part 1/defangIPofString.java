public class defangIPofString {
    public static void main(String[] args) {
        String str = "255.255.1.1";

        String defangIP = "";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '.'){
                defangIP += "[.]";
            }
            else{
                defangIP +=ch;
            }
        }
        System.out.println(defangIP);
    }
}
