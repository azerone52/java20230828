package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C04string {
    public static void main(String[] args) {
        String a = "java";

        Object o = a;
        //String 타입에 구현된 인터페이스들
        Serializable s = a;
        CharSequence c = a;
        Comparable<String> cp = a;
        Constable co = a;
        ConstantDesc cd = a;
    }
}
