package ch04_control;

public class Ex14_perfectNumber {
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 10000; i++) {
//			int sum = 0;
//			for(int k = 1; k < i; k++) {
//				if ( i % k == 0)
//					sum += k;
//			}
		int sum = divisorSum(i);
			if ( i == sum)
				System.out.println(i);
		}
}
		
	
	
	 static int divisorSum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				sum += i;
		}
		return sum;
		
//	 int sum = divisorSum(i);
//		if ( i == sum)
//			System.out.println(i);
	 }
}
