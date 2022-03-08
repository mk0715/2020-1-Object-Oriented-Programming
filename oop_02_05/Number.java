package oop_02_05;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		// 입력
		System.out.println("정수 입력 : ");
		Scanner scanner = new Scanner(System.in);				
		int number = scanner.nextInt();
		
		int a = (int)(Math.log10(number));
				
		// 3자리수 321 100 10
		for(int i=a; i>=0;i--) {
			int pow = (int)Math.pow(10, i);
			System.out.println(pow + "의 자릿수 : " + number/pow);
			number %=  pow;
		}
				
		scanner.close();
	}

}
