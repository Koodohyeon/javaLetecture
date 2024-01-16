package ch04_control;

import java.util.Scanner;

public class Q1_clock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇시> ");
		int Hour = Integer.parseInt(scan.nextLine());
		System.out.print("몇분> ");
		int Min = Integer.parseInt(scan.nextLine());
		scan.close();
		
		int newHour = Hour, newMin = 0;
		if (Min >= 45)
			newMin = Min -45;
		else {
			if (Hour % 24 == 0) {
				newHour = 23;
				newMin = Min + 60 - 45;
			} else {
				newHour = Hour - 1;
				newMin = Min + 60 - 45;
			}
		}
		System.out.printf("%02d:%02d%n", newHour, newMin);
		
		// Refactoring
		newHour = Hour; newMin = Min - 45;
		if (Min < 45) {
			newMin = Min + 60 - 45;
			newHour = (Hour % 24 == 0) ? 23 : Hour - 1;
		}
		System.out.printf("%02d:%02d%n", newHour, newMin);
	}

}
