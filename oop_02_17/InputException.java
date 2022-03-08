package oop_02_17;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("정수 3개를 입력하세요");
			int sum=0, n=0;
			int count = 0;
			int trycount = 0;
			while (count < 4 || trycount <11) {
				System.out.print(count+1 +">>");
				try {
					trycount++;
					n = scanner.nextInt(); // 정수 입력
					count++;
					sum += n; // 합하기
				}
				catch(InputMismatchException e) {
					System.out.println("정수가 아닙니다. 다시 입력하세요!");
					scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				}
				
			}
			System.out.println("합은 " + sum);
			scanner.close();
	}
}
