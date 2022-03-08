package oop_02_10;

class Solution {
	public static boolean solution(int[] arr) {
		boolean answer = true;
		return answer;  // 이부분에 코딩완료후 static지우고 class Solution 전체를 프로그래머스에 가져가기
	}
	
	public static void main(String[] args) {
		int[] arr = {9,7,7,1};  // 프로그래머스에서 주어진 예시값 넣기(or 테스트케이스 제작해서 넣기)
		System.out.println((solution(arr) == true));  // solution() 함수에 변수 넣고 true라고 찍는다
		int[] arr2 = {9,7,1,2};
		System.out.println((solution(arr2) == false));
		int[] arr3 = {1,2,3,4};
		System.out.println((solution(arr3) == true));
		int[] arr4 = {1,2,3,4,3,2,1};
		System.out.println((solution(arr4) == false));
	}

}
