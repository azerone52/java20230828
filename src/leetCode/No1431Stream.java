package leetCode;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

//stream으로 컬렉션 만들어서 하는 버전
public class No1431Stream {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        Solution1431 s = new Solution1431();
       // List<Boolean> list = s.kidsWithCandies(candies, extraCandies);

        //list.forEach(System.out::println);
    }
}

class Solution1431 {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int max = Arrays.stream(candies)
//                .max().getAsInt();
////        List<Boolean> list =  Arrays.stream(candies)
////                .map(e->(e+extraCandies)>=max)
////                .toList();
//
//        return true;
//    }
}