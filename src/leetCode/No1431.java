package leetCode;

import java.util.List;
import java.util.function.Consumer;

//Kids With the Greatest Number of Candies
public class No1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        Solution s = new Solution();
        List<Boolean> list = s.kidsWithCandies(candies, extraCandies);

        list.forEach(System.out::println);
        //위와 아래는 동일
//        list.forEach(new Consumer<Boolean>() {
//            @Override
//            public void accept(Boolean x) {
//                System.out.println(x);
//            }
//        });
    }
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return null;
    }
}
//class Some {
//    public static void main(String[] args) {
//        MyList list = new MyList();
//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer x) {
//                System.out.println(x);
//            }
//        });
//    }
//}
//
//class MyList {
//    private int[] field;
//    public void forEach(Consumer<Integer> action) {
//        for (Integer i : field) {
//            action.accept(i);
//        }
//    }
//}


