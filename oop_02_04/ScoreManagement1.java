package oop_02_04;

public class ScoreManagement1 {
	private static char toLevel(int attendance, int score) {
		// 90 - 100 : A
		// 80 - 89 : B
		// 70 - 79 : C
		// 0 - 69 : F
		// 출석일수가 14일 미만이면, F
		if (attendance < 14)
			return 'F';
		switch (score/10) {
		// case 100
		case 10:
		// 90이상 A
		case 9:
			return 'A';
		// 80이상 B
		case 8:
			return 'B';
		// 70이상 C
		case 7:
			return 'C';
		default:
			return 'F';
		}
	}
	public static void main(String[] args) {
		
		System.out.println(toLevel(30,100)); // A
		System.out.println(toLevel(30,92)); // A
		System.out.println(toLevel(15,89)); // B
		System.out.println(toLevel(20,73)); // C
		System.out.println(toLevel(30,69)); // F
		System.out.println(toLevel(25,80)); // B
		System.out.println(toLevel(14,70)); // C
		System.out.println(toLevel(12,100)); // F
		System.out.println(toLevel(13,92)); // F
		System.out.println(toLevel(10,89)); // F
		System.out.println(toLevel(0,73)); // F
		System.out.println(toLevel(12,69)); // F
		System.out.println(toLevel(5,80)); // F
		System.out.println(toLevel(7,70)); // F
	}

}
