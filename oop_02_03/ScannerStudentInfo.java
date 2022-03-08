package oop_02_03;

import java.util.Scanner;

public class ScannerStudentInfo {
	public static void main(String args[]) {
		// 사용자한테 정보를 입력하라고 알려줄 것.
		System.out.println("소속학부, 학번, 이름, 나이를 빈칸으로 분리하여 입력하세요.");
		
		// 시스템의 입력 : 소속학부, 학번, 이름, 나이 (Scanner)
		Scanner scanner = new Scanner(System.in);
		
		String department = scanner.next();
		String id = scanner.next();
		String name = scanner.next();
		int age = scanner.nextInt();
		
		// 시스템 출력
		System.out.println(department);
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		
		// scanner close
		scanner.close();  // scanner 기능이 never close되는걸 막기위해 close함수사용.
	}

}
