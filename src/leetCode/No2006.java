package leetCode;

import ch16lamda.book.B717No6.Function;

import java.util.Arrays;
import java.util.stream.Collectors;

public class No2006 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        int k = 2;

        Solution2006 solution2006 = new Solution2006();
        System.out.println(solution2006.countKDifference(nums, k));
    }
}
//뺏을 때 절댓값이 2가 되는 조합의 수를 stream으로 풀어보기
class Solution2006 {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        long count1 = Arrays.stream(nums)
                .boxed()
                .flatMap(n1 -> Arrays.stream(nums)
                        .boxed()
                        .map(n2 -> Math.abs(n1 - n2))
                )
                .filter(n -> n == k)
                .count();
        count = (int)count1/2;
        return count;
    }
}
