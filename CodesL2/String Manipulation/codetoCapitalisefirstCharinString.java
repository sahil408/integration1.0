
public class codetoCapitalisefirstCharinString {
    public static void capitaliseCode(String str){
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s1: s){
            if(s1.length()>0){
                sb.append(Character.toUpperCase(s1.charAt(0))).append(s1.substring(1)).append(" ");
                
            }     
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        String str = "sahil is a nice boy";
        capitaliseCode(str);
    }
}
