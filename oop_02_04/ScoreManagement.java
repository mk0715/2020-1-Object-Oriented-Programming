package oop_02_04;

public class ScoreManagement {
	private static char toLevel(int attendance, int score) {
		// 90 - 100 : A
		// 80 - 89 : B
		// 70 - 79 : C
		// 0 - 69 : F
		// 출석일수가 14일 미만이면, F
		if (attendance < 14)
			return 'F';
		if (score >= 90) 
			return 'A'; // 안의 문장이 하나면 {} 생략가능.
		else if (score >= 80) // 한번 위에서 넣어보고 안되면 밑으로 내려옴.
			return 'B';
		else if (score >= 70)
			return 'C';
		
		return 'F';
	}
	public static void main(String[] args) {
	
		System.out.println(toLevel(30,92)); // A
		System.out.println(toLevel(15,89)); // B
		System.out.println(toLevel(20,73)); // C
		System.out.println(toLevel(30,69)); // F
		System.out.println(toLevel(25,80)); // B
		System.out.println(toLevel(14,70)); // C
		System.out.println(toLevel(13,92)); // F
		System.out.println(toLevel(10,89)); // F
		System.out.println(toLevel(0,73)); // F
		System.out.println(toLevel(12,69)); // F
		System.out.println(toLevel(5,80)); // F
		System.out.println(toLevel(7,70)); // F
	}

}
