package ch09_modifier.sec02_access.xyz;

import ch09_modifier.sec02_access.abc.A;

public class D extends A {
	void xyz() {
		System.out.println(a + b);		// 다른 패키지 A 클래스의 a, b 변수 사용가능
		
	}
	public static void main(String[] args) {
		
	int a;
	for (a = 0; a < 10; a++) {
		System.out.println("");
	}
		
		
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
	}
}

