import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CodesL2.Maps.vowelfrequency;

public class practice {
    public static void callfun(String[] s){

      for(int i=0; i<s.length; i++){
        for(int j=i+1; j<s.length;j++){
            if(s[i].length()>s[j].length()){
                String a = s[j];
                s[j] = s[i];
                s[i] = a;
            }
        }
      }
      List<String> ns = new ArrayList<>();
      for(String na : s){
        ns.add(na);
      }
      System.out.println(ns);    
    }

    public static void main(String[] args) {
        
       String[] a = {"apple", "kiwi", "banana"};
       callfun(a);
    }

}

