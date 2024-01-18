package Q_연습.sec01_Cash;

import java.util.Scanner;

public class Q1_Cashmain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이>");
		int age = Integer.parseInt(scan.nextLine());
		System.out.print("금액>");
		int cash = scan.nextInt();
		scan.close();
		
		Q1_Cash CA = new Q1_Cash(age, cash); 
		System.out.println(CA);
		
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (!CA.ride())
				break;
	//		System.out.print(i + "회 탑승후 ");
//			System.out.println(CA);
		}

	}

}
