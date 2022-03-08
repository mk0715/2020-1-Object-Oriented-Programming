package oop_02_17;

public class NumException {
	public static void main (String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		
		int i=0;
		for (i=0; i<stringNumber.length; i++) {	 // for문 위치 바꿔주면 중간에 예외처리가 되어도 멈추지않고 끝까지 돌아감.
		try {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
			}
		}
	}
}
