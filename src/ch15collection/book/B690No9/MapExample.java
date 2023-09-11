package ch15collection.book.B690No9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> keyed = map.keySet();
        for(String key : keyed){
            if(map.get(key)>maxScore) {
                maxScore = map.get(key);
                name = key;
            }
            totalScore += map.get(key);
        }

        System.out.println("name = " + name);
        System.out.println("maxScore = " + maxScore);
        System.out.println("평균 = " + totalScore/map.size());
    }
}
