package oop_02_04;

public class StoreManagement1 {
	public static void main(String[] args) {
		// 월화수목금토일(첫 비트 비워둠)
		byte storeA = 0b01011111; // 화요일만 휴무
		byte storeB = 0b01011110; // 화,일 휴무
		byte storeC = 0b01111100; // 토,일 휴무
		
		// 화요일에 오픈 하는 가게
		byte openedTue = 0b00100000;
		
		System.out.println("StoreA: " + ((storeA & openedTue) > 0)); // &연산자를 썼을때 전부0이 나온다.
		System.out.println("StoreB: " + ((storeB & openedTue) > 0)); // &연산자를 썼을때 전부0이 나온다.
		System.out.println("StoreC: " + ((storeC & openedTue) > 0)); // &연산자를 썼을때 화요일에 1이 나오므로 0이 아니다.
	}

}
