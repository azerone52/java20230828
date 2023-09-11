package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class No1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        Solution1512 solution1512 = new Solution1512();
        System.out.println(solution1512.numIdenticalPairs(nums));
    }
}
class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int count=0;

//        for(int i=0; i<nums.length-1; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i]==nums[j]){
//                    count++;
//                }
//            }
//        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            if(!map.containsKey(n)){
                map.put(n,1);
            }
            else {
                map.put(n, map.get(n) + 1);
            }
        }
        Set<Integer> k = map.keySet();
        for(int n:k){
            if(map.get(n)>1){
                //System.out.println(n+":"+map.get(n));
                for(int i=0; i<map.get(n);i++){
                    count+=i;
                }
            }
        }
        return count;
    }
}