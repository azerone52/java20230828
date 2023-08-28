package ch05reference;

public class C06matrix {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{10,20,30},{100,200,300}};
		int[][] b=a;
		
		int b1=System.identityHashCode(b);
		
		b[2]=new int[] {111,222,333};//이런 식으로 배열 바꿀 수 있구나 이런 경우 주소값이 변하지는 않는구나
		System.out.println(b[2][2]);//333
		System.out.println(a[2][2]);//333
		
		int b2=System.identityHashCode(b);
		
		//b에 새객체의 참조값이 할당됨
		b = new int[][] {{33,44},{22,11}};//완전히 새로운 배열을 넣음 주소값이 변하지 않음
		
		System.out.println(b[0][0]);//33
		System.out.println(a[0][0]);//1
		
		int b3=System.identityHashCode(b);
		
		System.out.println("첫번째 b의 참조값: "+b1);
		System.out.println("두번째 b의 참조값: "+b2);
		System.out.println("세번째 b의 참조값: "+b3);
	}
}
