package CodesL2.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class vowelfrequency {

    public static void callfreq(String s) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) == 'a') {
                ++a;
            } else if (s.charAt(k) == 'e') {
                ++e;
            } else if (s.charAt(k) == 'i') {
                ++i;
            } else if (s.charAt(k) == 'o') {
                ++o;
            } else if (s.charAt(k) == 'u') {
                ++u;
            }
        }

        System.out.println("No of a: " + a);
        System.out.println("No of e: " + e);
        System.out.println("No of i: " + i);
        System.out.println("No of o: " + o);
        System.out.println("No of u: " + u);
    }

    public static void optimisedvowel(String s) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int k = 0; k < s.length(); k++) {
            switch (s.charAt(k)) {
                case 'a':
                    ++a;
                    break;
                case 'e':
                    ++e;
                    break;
                case 'i':
                    ++i;
                    break;
                case 'u':
                    ++u;
                    break;
                case 'o':
                    ++o;
                    break;
            }
        }
        System.out.println("No of a: " + a);
        System.out.println("No of e: " + e);
        System.out.println("No of i: " + i);
        System.out.println("No of o: " + o);
        System.out.println("No of u: " + u);
    }

    public static void moreoptimisedvowel(String s){
        Map<Character, Integer> vowelCount= new HashMap<>();
        for(char c: new char[] {'a','e','i','o','u'}){
            vowelCount.put(c, 0);
        }
        for(char ch: s.toCharArray()){
            if(vowelCount.containsKey(ch)){
                vowelCount.put(ch, vowelCount.get(ch)+1);
            }
        } 
        for(char v: vowelCount.keySet()){
            System.out.println("no of "+ v+ " is " + vowelCount.get(v));
        }
    }

    public static void findingConsonants(String s){
        Set<Character> sco = Set.of('a','e','i','o','u');
        Map<Character, Integer> vowelCount= new HashMap<>();

        for(char ch: s.toCharArray()){
            if(Character.isLetter(ch) && !sco.contains(ch)){
                vowelCount.put(ch, vowelCount.getOrDefault(ch,0)+1);
            }
        } 
        for (Map.Entry<Character, Integer> entry : vowelCount.entrySet()) {
            System.out.println("No of " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String s = "dsdiecsflasioukdsdsd";
        callfreq(s);
        optimisedvowel(s);
        moreoptimisedvowel(s);
        findingConsonants(s);
    }
}
