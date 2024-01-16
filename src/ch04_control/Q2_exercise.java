package ch04_control;

public class Q2_exercise {
	public static void main(String[] args) {
	
	int score = 99;
	if( score >= 90 ) {
		System.out.println("A학점");
	} 
	else if( score >= 80) {
		System.out.println("B학점");
	} 
	else if (score >= 70) {
		System.out.println("C학점");
	} 
	else {
		System.out.println("F학점");
	}
	
	switch(score / 10) {
		case 10:
		case 9:	
			System.out.println("A학점"); break;
		case 8:	
			System.out.println("B학점"); break;
		case 7:	
			System.out.println("C학점"); break;
		default:
			System.out.println("F학점");
	}
}
}
   
