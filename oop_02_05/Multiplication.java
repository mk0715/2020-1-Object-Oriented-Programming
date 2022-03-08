package oop_02_05;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		for(int i = 2; i <=9 ; i++) { // i < 10도 가능.
			for(int j =1; j<=9; j++) {
				System.out.println(i + " * " + j + " = ");
				int answer = scanner.nextInt();
				if (answer != i * j) {
					// 중첩 반복을 벗어나기
					i = 10;
					break;
				}
			} // break써서 여기서 끝남.
		}
		
		// 프로그램이 종료됩니다. 메시지 남기고 종료
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}

}
