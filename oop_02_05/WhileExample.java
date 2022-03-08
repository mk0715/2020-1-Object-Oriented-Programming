package oop_02_05;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		System.out.println("양의 정수를 연속적으로 입력하고, 종료하려면 -1을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		// 사용자가 -1을 입력할 때까지 반복해서 (for 불가)
		int number = scanner.nextInt();
		
		// 입력 받는 수의 개수 : int
		int count = 0;
		
		// 입력 받은 수의 합 : int
		int sum = 0;
		
		while(number != -1) {
			if(number >= 100) {
				System.out.println("100 미만의 수만 입력하세요.");
				number = scanner.nextInt();
				continue; // 수행하지않고 다음 방법으로 넘어감.
			}
				count ++; // count += 1; or count = count + 1;
				sum += number;
				// 사용자로부터 입력
				number = scanner.nextInt();
		}
		System.out.println("입력정수의 개수는 " + count);
		System.out.println("평균은" + (double)sum / count);
		
		scanner.close();
	}

}
