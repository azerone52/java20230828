package leetCode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class No1512Stream {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        SolutionStream1512 solution1512 = new SolutionStream1512();
        System.out.println(solution1512.numIdenticalPairs(nums));
    }
}
class SolutionStream1512 {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(e->e, Collectors.counting()));
                                            //e->e == Function.identity

        System.out.println(map);

        count = map.values().stream().map(e->(e*(e-1))/2).mapToInt(n->n.intValue()).sum();

        return count;
    }
}