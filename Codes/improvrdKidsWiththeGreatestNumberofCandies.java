import java.util.ArrayList;
import java.util.List;

public class improvrdKidsWiththeGreatestNumberofCandies {

    public static void main(String[] args) {
        
        int[] kids = {1,2,0,5,4,3,6};
        int extraC = 4;
        int maxcandies = 0;

        for(int candies: kids){
            if(candies>maxcandies){
                maxcandies = candies;
            }
        }

        List<Boolean> res = new ArrayList<>();

        for(int candies : kids){
            res.add(candies+extraC >= maxcandies);
        }
        System.out.println(res);
    }
    
}
