
public class printingfirstchar {
    public static void callfun(String s1){

        StringBuilder sb  = new StringBuilder();

        String[] s = s1.split(" ");

        int count =0;
        for(String s2: s){
            if(count<s.length-1){
                sb.append(s2.charAt(0));
                sb.append(" ");
                count++;
            }
        }
        if(count==s.length-1){
            sb.append(s[count]);
        }

        System.out.println(sb.toString());
      
    }
    public static void main(String[] args) {
        String s = "abc def ghi jklm";
        // OP =. a d g jklm
        callfun(s);
    }
}


// for(int i=0; i<s.length-1;i++){ 
//     sb.append(s[i].charAt(0));
//     sb.append(" ");
// }
// System.out.println(sb.toString());

