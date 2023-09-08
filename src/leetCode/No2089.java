package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No2089 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;

        Solution2089 s = new Solution2089();
        List<Integer> list= s.targetIndices(nums, target);

        list.forEach(System.out::println);

    }
}
class Solution2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                list.add(i);
            }
        }

        return list;
    }
}
