package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {
        //Map:key, value 쌍(entry)를 저장
        //key가 중복된 entry가 있을 수 없다.

        //Map은 인터페이스->인터페이스는 인스턴스 구현 불가->인터페이스를 구현한 클래스를 인스턴스로 생성
        Map<String, String> map = new HashMap<>();

        //put: entry 추가 메소드
        map.put("student1", "손흥민");
        map.put("student2", "이강인");
        map.put("student3", "김민재");

        //size: entry의 개수 확인 메소드
        System.out.println("map.size() = " + map.size());

        //entry 교체 메소드
        //put: 없으면 추가 있으면 교체
        map.put("student3", "박지성");

        //remove: entry 삭제 메소드
        map.remove("student2");

        //get: entry의 value를 얻는 메소드
        String student3 = map.get("student3");
        System.out.println("student3 = " + student3);
        System.out.println("map.get(\"student2\") = " + map.get("student2"));
    }
}
