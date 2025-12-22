package CodesL2.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortarraybasedonlength {
    public static void callsortbasedonlength(String[] a){
        
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].length()>a[j].length()){
                    String s = a[j];
                    a[j] = a[i];
                    a[i] = s;
                }
            }
        }
        List<String> al = new ArrayList<>();
        for(String s: a){
            al.add(s);
        }
        System.out.println(al);
    }

    public static void calloptimised(String[] s){
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                return Integer.compare(s1.length(), s2.length());
            }
        });
        List<String> al = new ArrayList<>();
        for(String s1: s){
            al.add(s1);
        }
        System.out.println(al);
    }


    public static void main(String[] args) {
        String[] a = {"Apple", "Banana", "Orange", "Kiwi", "Pomegranate", "Guava", "Jack Fruit"};
        callsortbasedonlength(a);
        calloptimised(a);
    }
}
