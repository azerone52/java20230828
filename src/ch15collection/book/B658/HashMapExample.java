package ch15collection.book.B658;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Map Entry 기초와 전체 탐색
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("map.size() = " + map.size());
        System.out.println();

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key+":"+value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k+":"+v);
        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+":"+v);
        }
        System.out.println();

        //향상된 for문
        for(String k:keySet){
            System.out.println(k+":"+map.get(k));
        }
        System.out.println();

        for(Entry<String, Integer> set:entrySet) {
            System.out.println(set.getKey() + ":" + set.getValue());
        }
        System.out.println();

        //forEach
        map.forEach((k,s)-> System.out.println(k+":"+s));
        System.out.println();

        map.remove("홍길동");
        System.out.println("map.size() = " + map.size());
        System.out.println();
    }
}
