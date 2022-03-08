package oop_02_05;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("양의 정수를 연속적으로 입력하고, 종료하려면 -1을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		// 사용자가 -1을 입력할 때까지 반복해서 (for 불가)
		int number = 0;
		
		// 입력 받는 수의 개수 : int
		int count = 0;
		
		// 입력 받은 수의 합 : int
		int sum = 0;
		
		do {
			number = scanner.nextInt(); // 위에서 int number 선언 안해주면 int number = scanner.nextInt(); 사용
			count++;
			sum += number;
		} while(sum < 100);
		
		System.out.println("입력정수의 개수는 " + count);
		System.out.println("합은" + sum);
		
		scanner.close();
	}


}
