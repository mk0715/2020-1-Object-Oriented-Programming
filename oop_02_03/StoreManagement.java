package oop_02_03;

public class StoreManagement {
	public static void main(String[] args) {
		
		// 월화수목금토일(첫 비트 비워둠)
		byte storeA = 0b01011111;
		byte storeB = 0b01111111;
		byte storeC = 0b01111100;
		
		// 화요일 휴무 마스크
		byte closedTue = 0b00100000; // 원래 01011111이지만 그거의 반대로 사용. 이유는 원래꺼로 사용시 모두 원래꺼의 결과값이 나오게 됨.
		
		
		System.out.println("storeA : " + ((storeA & closedTue) == 0)); // True이므로 화요일 휴무
		System.out.println("storeB : " + ((storeB & closedTue) == 0)); // False이므로 화요일 운영
		System.out.println("storeC : " + ((storeC & closedTue) == 0)); // False이므로 화요일 운영
	}
}
