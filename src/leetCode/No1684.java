package leetCode;

import java.util.HashSet;
import java.util.Set;

public class No1684 {
    public static void main(String[] args) {
        String allowed = "fstqyienx";
        String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};

        Solution1684 solution1684 = new Solution1684();

        System.out.println(solution1684.countConsistentStrings(allowed,words));
    }
}
class Solution1684{
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> allowedSet = new HashSet<>();
        for(char c : allowed.toCharArray()){
            allowedSet.add(c);
        }
        for(String word:words){
            for(char w:word.toCharArray()){
                if(!allowedSet.contains(w)){
                    count++;
                    break;
                    //System.out.println(word);
                }
            }
        }

        return words.length-count;
    }
}