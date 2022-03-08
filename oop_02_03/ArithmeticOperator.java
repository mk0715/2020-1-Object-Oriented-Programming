package oop_02_03;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String args[]) {
		// 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("세 자리 정수 입력 : ");
		
		int number = scanner.nextInt();
		
		// 1의 자리수, 10의 자리수, 100의 자리수
		int number100 = number / 100;
		int number10 = (number % 100) / 10;
		int number1 = (number % 100) % 10;
		
		System.out.println("백의 자리수 : " + number100);
		System.out.println("십의 자리수 : " + number10);
		System.out.println("일의 자리수 : " + number1);
		
		scanner.close();
	}

}
