package Q_연습;

public class Q03_MAxPal {
	
	public static void main(String[] args) {
		int MaxPal = 0, x = 0, y = 0;
		for(int i = 100; i <= 999; i++) {
			for (int k = i; k <= 999; k++) {
				int mul = i * k;
				if (ispalindrome(String.valueOf(mul))) {			// "" + mul
					if (mul > MaxPal) {
						MaxPal = mul; x = i; y = k;
					}
				}
			}
		}
		System.out.println(x + " x " + y + " = " + MaxPal);
		
	}
	
	static boolean ispalindrome(String str) {
		return str.equals(reverse(str));
	}
	
	static String reverse(String str) {
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reverseStr += str.charAt(i);
		return reverseStr;
			
	}

}
