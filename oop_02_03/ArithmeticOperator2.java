package oop_02_03;

import java.util.Scanner;

public class ArithmeticOperator2 {

	public static void main(String[] args) {
		// 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("세 자리 정수 입력 : ");
		
		// String으로 받을 경우
		String number = scanner.next();
		System.out.println(number.charAt(0)); // 첫번째 자리 받기
		System.out.println(number.charAt(1)); // 두번째 자리 받기
		System.out.println(number.charAt(2)); // 세번째 자리 받기
		
		int a = 3; int b =4;
		boolean result = a > b;
		System.out.println(result);
		
		
		scanner.close();

	}

}
