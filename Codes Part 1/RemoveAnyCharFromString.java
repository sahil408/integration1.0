public class RemoveAnyCharFromString {

    //removing all the vowels

    public static void main(String[] args) {
        String str = "sahil Kundan";
        char[] ch = str.toCharArray();
        char[] vow  = {'a','e','i','o','u','A','E','I','O','U'};
        StringBuilder res = new StringBuilder();

            for(int i=0;i<ch.length;i++){
                boolean vowel = false;
                for(int j=0;j<vow.length;j++){
                    if(ch[i]==vow[j]){
                        vowel = true;
                        break;
                    }
                }
                    if(!vowel){
                        res.append(ch[i]);
                    }
                       
        }
        System.out.println(res.toString());  
    }
    
}
