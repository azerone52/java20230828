package leetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class No118 {
    //선생님 코드 확인해보기
    public static void main(String[] args) {
        int num = (int)(Math.random()*30+1);
        System.out.println(num);

        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));
        //sublist.add(1);
        //list.add(sublist);
        //[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        if(num>=2) {
            for(int l=1; l<num; l++) {
               // List<Integer> sublist = new ArrayList<>();
//                list.add(List.of(1));
                list.add(new ArrayList<>());
                list.get(l).add(1);
                for (int i = 1; i <= l; i++) {
                    BigInteger c1 = BigInteger.ONE;
                    BigInteger c2 = BigInteger.ONE;
                    for (int j = l; j >= l - i + 1; j--) {
                        c2 = c2.multiply(BigInteger.valueOf(j));
                    }
                    for (int k = 1; k <= i; k++) {
                        c1 = c1.multiply(BigInteger.valueOf(k));
                    }
                    //System.out.println(c2);
                    //System.out.println(c1);
                    //System.out.println(c2/c1);
                    list.get(l).add(c2.divide(c1).intValue());
                }
                //list.add(sublist);
                //sublist.clear();
            }
        }
        list.forEach(System.out::println);
    }
}
