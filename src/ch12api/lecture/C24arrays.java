package ch12api.lecture;

import java.util.Arrays;

public class C24arrays {
    public static void main(String[] args) {
        //Arrays: 배열을 다루는 메소드들 있음
        //equals: 두 배열이 같은지
        //fill: 배열을 특정 값으로 채우기
        //sort: 배열 정렬
        //binarySearch: 특정 원소의 위치 찾기
        //toString: 문자열로 변환

        int[] arr1 = new int[5];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 5);
        System.out.println(Arrays.toString(arr1));

        //sort
        int[] arr2 = {3,-2,10,0,-1};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {3,4,5};
        int[] arr4 = {3,4,5};
        int[] arr5 = {4,3,5};

        System.out.println(arr3==arr4);//false
        System.out.println(Arrays.equals(arr3,arr4));//true
        System.out.println(Arrays.equals(arr4,arr5));//false

        Arrays.sort(arr4);
        Arrays.sort(arr5);
        System.out.println(Arrays.equals(arr4,arr5));//true
        
        //binary search: 이진탐색
        //정렬이 먼저 필요함 
        int[] arr6 = {5,2,3,1,4};
        int i = Arrays.binarySearch(arr6, 1);
        System.out.println("i = " + i);//i=-1

        Arrays.sort(arr6);
        int j = Arrays.binarySearch(arr6, 1);
        System.out.println("j = " + j);//j=0
    }
}
