package Arrays;
import java.util.*;

public class ContainsDuplicate {
     public static boolean isContains(int nums[]){

        HashSet<Integer> set = new HashSet<>();

        for(Integer list : nums){
            if(set.contains(list)){
                return true;

            }
            set.add(list);
        }
        return false;


     }
    public static void main(String[] args) {
        int nums[] = {2,4,4,6,8,10,2};
        System.out.println(isContains(nums));
    }
    
}
