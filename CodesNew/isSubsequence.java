package CodesNew;

public class isSubsequence {

    public static boolean callseq(String s, String t){
        int i=0;
        int j=0;
        char[] sc =s.toCharArray();
        char[] tc = t.toCharArray();
        while(i<sc.length && j<tc.length){
                if(sc[i] == tc[j]){
                    i++;
                    j++;
                }else{
                    j++;
                }  
            }
        if(i==sc.length){
            return true;
        }else{
            return false;
        }  
    }

    public static boolean callseqoptimised(String s, String t){
        int i=0, j=0;
        while(i<s.length() && j<t.length()){
                if(s.charAt(i) == t.charAt(i)){
                    i++;
                    j++;
                }else{
                    j++;
                }  
            }
        if(i==s.length()){
            return true;
        }else{
            return false;
        }  
    }


    public static void main(String[] args) {
        String s = "abc";
        String t = "agfbfdc";

        String s1 = "aaaaaaa";
        String t1 = "abaaaa";

        boolean b = callseq(s,t);
        System.out.println(b);

       boolean b1 = callseqoptimised(s1,t1);
        
       System.out.println(b1);
    }
}



// while(i< s.length()){
//     do{
//         for(int j=0;j<t.length();j++){
//             if(s.charAt(i)==t.charAt(j)){
//                 t= t.replaceAll(Character.toString(t.charAt(i)), "");
//                 len1 = t.length();
//             }
//         }
//     }while(len1!=0);

// int i=0;
//         char[] sc =s.toCharArray();
//         char[] tc = t.toCharArray();
//         while(i<sc.length){
//             for(char ch1: tc){
//                 if(sc[i] == ch1){
//                     i++;
//                 }else if(sc[i] == ch1){
//                     i++;
//                 }else{
//                    return true; 
//                 }
//             }
//         }
//         return false;



// char[] sc =s.toCharArray();
//         char[] tc = t.toCharArray();
//         while(i<sc.length){
//             while(j<tc.length){
//                 if(sc[i] == tc[j]){
//                     i++;
//                     j++;
//                 }else if(sc[i] == tc[j]){
//                     j++;
//                 }else{
//                    return true; 
//                 }
//             }
//         }
//         return false;


// int i=0;
// int j=0;
// char[] sc =s.toCharArray();
// char[] tc = t.toCharArray();
// while(i<sc.length && j<tc.length){
//         if(sc[i] == tc[j]){
//             i++;
//         }else{
//             j++;
//         }  
//     }
// if(i==sc.length){
//     return true;
// }else{
//     return false;
// }