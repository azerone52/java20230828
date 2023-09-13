package leetCode;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class No1748Stream {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};

        SolutionStream1748 solution1748 = new SolutionStream1748();
        System.out.println(solution1748.sumOfUnique(nums));
    }
}

class SolutionStream1748 {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        sum = map.entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(e->e.getKey())
                .reduce(0,Integer::sum);
                //.reduce(Integer::sum).get();


        return sum;
    }
}
