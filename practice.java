import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CodesL2.Maps.vowelfrequency;

public class practice {

    public static void callfun(int[] n){
      int i=0;
      int j=n.length-1;

      int max =0;

      while(i<j){
        int height = Math.min(n[i], n[j]);
        int width = j-i;
        int area = height * width;
        max = Math.max(max, area);

        if(n[i]<n[j]){
          i++;
        }else{
          j--;
        }
      }
      System.out.println(max);
    }

    public static void main(String[] args) {
        int[] n = {1,2,5,6,7,8,4,2,3,5,6,5,7,1};
        callfun(n);
       
    }

}

