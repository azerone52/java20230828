package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        Solution287 solution = new Solution287();
        int result = solution.findDuplicate(nums);
        System.out.println("result = " + result);
    }

}
class Solution287 {
    public int findDuplicate(int[] nums) {
        //Set이 contains 메소드에 있어서 list보다 효율이 좋음
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            if(set.contains(n)){
                return n;
            }
            set.add(n);
        }
//        List<Integer> list = new ArrayList<>();
//        for(int n : nums){
//            if(list.contains(n)){
//                return n;
//            }
//            list.add(n);
//        }

        return 0;
    }
}
