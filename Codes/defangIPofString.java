public class defangIPofString {
    public static void defangIp(String s) {
        String newdefang = "";
     
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '.'){
                newdefang = newdefang + "[.]";
            }
            else{
                newdefang = newdefang+ ch;
            }
        }
        System.out.println(newdefang);
    }

    public static void main(String[] args) {
        String s = "255.255.1.1";
        defangIp(s);
        
    }
}
