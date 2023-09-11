package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class No2206 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};

        Solution2206 solution2206 = new Solution2206();
        System.out.println(solution2206.divideArray(nums));
    }
}
class Solution2206 {
    public boolean divideArray(int[] nums) {
        boolean result=false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            if(!map.containsKey(n)){
                map.put(n,1);
            }
            else{
                map.put(n,map.get(n)+1);
            }
        }
        Set<Integer> k = map.keySet();
        int cnt=0;
        for(int key:k){
            if(map.get(key)%2==0){
                cnt+= map.get(key)/2;
            }
        }
     //   System.out.println(cnt);
        if(cnt==nums.length/2)
            result=true;

        return result;
    }
}