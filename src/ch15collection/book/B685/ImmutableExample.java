package ch15collection.book.B685;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> immutableList1 = List.of("A","B","C");

        Set<Integer> immutableSet1 = Set.of(1,2,3);

        Map<Integer,String> immutableMap1 = Map.of(
                1,"A",
                2,"B",
                3,"C"
        );

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Set<Integer> immutableSet2 = Set.copyOf(set);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);

        String[] arr = {"A","B","C"};
        List<String> immutableList3 = Arrays.asList(arr);
    }
}

