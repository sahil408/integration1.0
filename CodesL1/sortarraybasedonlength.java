package CodesL1;

import java.util.ArrayList;
import java.util.List;

public class sortarraybasedonlength {
    public static void callsortbasedonlength(String[] a){
        List<String> al = new ArrayList<>();
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].length()>a[j].length()){
                    String s = a[j];
                    a[j] = a[i];
                    a[i] = s;
                }
            }
        }
        for(String s: a){
            al.add(s);
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        String[] a = {"Apple", "Banana", "Orange", "Kiwi", "Pomegranate", "Guava", "Jack Fruit"};
        callsortbasedonlength(a);
    }
}
