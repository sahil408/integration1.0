using System;

class reverseString{

    static void reverseStr(String str){
        int n =str.Length;
        char []ch =str.ToCharArray();
        char temp;

        for(int i=0, j=n-1; i<j; i++, j--){
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        Console.WriteLine(ch);
    }

    //Driver program
    public static void Main(String[] args){
        String str = "sahil";
        reverseStr(str);
    }

}

