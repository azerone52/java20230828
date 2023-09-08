package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
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
//추가 사탕까지 받았을 때 가장 많은 사탕이 있을 경우 true
//max값을 가진 녀석을 먼저 구한 후 비교하면 되겠군
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //sort로 최댓값 찾는 걸 써보고 싶어서 써봤는데 효율 너무 낮음
//        int[] sortCandies = new int[candies.length];
//        for(int i=0; i<candies.length; i++){
//            sortCandies[i] = candies[i];
//
//        }
//        Arrays.sort(sortCandies);
//        int max = sortCandies[sortCandies.length-1];
//
//        List<Boolean> list = new ArrayList<>();
//        for(int i=0; i<candies.length; i++){
//            if(max<=(candies[i]+extraCandies)){
//                list.add(true);
//            }
//            else{
//                list.add(false);
//            }
//        }
//        return list;
        int max=0;
        for (int i = 0; i < candies.length; i++) {
            if(max<candies[i]){
                max=candies[i];
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if(max<=(candies[i]+extraCandies)){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
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


