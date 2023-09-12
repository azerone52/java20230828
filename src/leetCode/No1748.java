package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class No1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};

        Solution1748 solution1748 = new Solution1748();
        System.out.println(solution1748.sumOfUnique(nums));
    }
}

class Solution1748 {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            //if(entry.getValue().equals(1)) 도 가능
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }
//        Set<Integer> set = new HashSet<>();
//        for(int i=0;i<nums.length-1; i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    //System.out.printf("nums[%d]=%d와 nums[%d]=%d는 같다\n",i,nums[i],j,nums[j]);
//                    set.add(nums[i]);
//                }
//            }
//        }
//        for(int i:nums){
//            if(!set.contains(i)){
//                sum+=i;
//            }
//        }
        return sum;
    }
}