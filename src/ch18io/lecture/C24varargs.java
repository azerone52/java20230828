package ch18io.lecture;

public class C24varargs {
    //변경 가능한 아규먼트들
    public static void main(String[] args) {
        //varargs(가변인자): ...

        //가변인자 없던 시절
        method1(3);
        method1(5, 6);
        method1(new int[]{10,20,30});

        //가변인자 이후
        method2();
        method2(2);
        method2(3,4);
        method2(6,7,8);
    }
    public static void method1(int a){}
    public static void method1(int a, int b){}
    public static void method1(int[] arr){}

    public static void method2(int... nums){
        //가변인자 사용법
        //배열로 사용
        for(int i = 0; i< nums.length; i++){
            System.out.println("nums["+i+"] = " + nums[i]);
        }
        //향상된 for문도 가능
//        for(int i: nums){
//            System.out.println("i = " + i);
//        }
    }
    public static void method3(String str, int... args){
        //사용시 주의할 점
        //파라미터 목록 마지막에만 사용 가능
    }
}
