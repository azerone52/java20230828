package ch08interface.lecture;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i = 3;
        //상속받은 클래스
        Number n = i;
        //구현한 인터페이스
        Comparable<Integer> ci = i;
        Constable c = i;
        ConstantDesc cd = i;
    }
}
