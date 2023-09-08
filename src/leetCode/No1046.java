package leetCode;

import java.util.Arrays;

public class No1046 {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};

        Solution1046 s = new Solution1046();

        System.out.println(s.lastStoneWeight(stones));
    }
}
class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int length = stones.length;
        if(length>1) {
            while (stones[length - 2] != 0) {
                if (stones[length - 1] > stones[length - 2]) {
                    stones[length - 1] = stones[length - 1] - stones[length - 2];
                    stones[length - 2] = 0;
                } else {
                    stones[length - 2] = 0;
                    stones[length - 1] = 0;
                }
                return lastStoneWeight(stones);
            }
        }
        return stones[length-1];
    }
}