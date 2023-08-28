package ch05reference;

public class C04array {
	public static void main(String[] args) {
		int a=5;
		int b=a;
		
		System.out.println(a);//5
		System.out.println(b);//5
		
		int[] c= {3,4,5};
		int[] d=c;
		
		System.out.println(c[0]);//3
		System.out.println(d[0]);//3
		
		d[0]=1;
		
		System.out.println(c[0]);//1
		System.out.println(d[0]);//1
		
	}
}
