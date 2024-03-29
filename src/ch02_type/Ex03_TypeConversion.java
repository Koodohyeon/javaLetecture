package ch02_type;

public class Ex03_TypeConversion {
	
	public static void main(String[] args) {
		/*
		 * 자동 타입변환(Promotion): 작은 것에서 큰 것으로 갈 경우
		 * 		byte -> short -> int -> long -> float -> double -> String
		 */
		short a = 256;
		int b = a;
		long c = b;
		float d = c;
		double e = d;
		System.out.printf("%d, %d, %.1f, %.1f%n", b, c, d, e);
		
		/*
		 * 강제 타입변환(Casting): 큰 것에서 작은 것으로 갈 경우, 표시가능한 범위를 벗어나면 불가
		 */
		long f = 250L;
		int g = (int) f;
		short h = (short) g;
		double i = 3.14;
		double j = (float) i;
		System.out.printf("%d, %d, %.2f, %.2f%n", g, h, i, j);
		System.out.println("(int) i: " + (int) i);
		
		// 연산에서의 자동 타입변환
		long k = a + b + c;		// short + int + long
		double l = d + e;		// float + double
		double m = a / b;		// int / int ==> truncate후 정수 ==> double로 변환
		System.out.println("k: " + k + ", l: " + l + ", m: " + m);
	}

}
