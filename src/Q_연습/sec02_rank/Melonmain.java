package Q_연습.sec02_rank;

import java.util.Scanner;

public class Melonmain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("등수> ");
		int rank = Integer.parseInt(scan.nextLine());
//		String title = scan.next();
//		String artist = scan.next();
//		String album = scan.next();
//		int like = scan.nextInt();
		scan.close();
		Melon[] melons = new Melon[5];
		melons[0] = new Melon(1, "비의 랩소디", "임재현", "비의 랩소디", 33220);
		melons[1] = new Melon(2, "To. X", "태연", "The 5th mini", 82820);
		melons[2] = new Melon(3, "Perfect Night", "르세라핌", "Perfect Night", 94996);
		melons[3] = new Melon(4, "Drame", "aespa", "The 4th mini", 68541);
		melons[4] = new Melon(5, "에피소드", "이무진", "에피소드", 33257);
		
		switch(rank) {
		case 1:
			System.out.println(melons[0]);
			break;
		case 2:
			System.out.println(melons[1]);
			break;
		case 3:
			System.out.println(melons[2]);
			break;
		case 4:
			System.out.println(melons[3]);
			break;
		case 5:
			System.out.println(melons[4]);
			break;
		default:
			System.out.println("데이터가 존재하지 않습니다.");
		}
		System.out.println();

	}

}
