package leetCode;

import java.util.HashSet;
import java.util.Set;

public class No771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        Solution771 solution771 = new Solution771();
        System.out.println(solution771.numJewelsInStones(jewels, stones));
    }
}
class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();

        int count=0;

        for(char c: jewels.toCharArray()){
            jewelSet.add(c);
        }
//        for(char c: jewelSet){
//            for(char s: stones.toCharArray()){
//                if(s==c){
//                    count++;
//                }
//            }
//        }
        for(char c: stones.toCharArray()){
            if(jewelSet.contains(c)){
                count++;
            }
        }

        return count;
    }
}
