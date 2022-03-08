package oop_02_01;

import java.util.Scanner;

public class Weekday {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 년 월 일 입력받기
		System.out.println("년을 입력해주세요.");
		int year = scan.nextInt();
		System.out.println("달을 입력해주세요.");
		int month = scan.nextInt();
		System.out.println("일을 입력해주세요.");
		int day = scan.nextInt();
		
		// 일로 변환한 숫자 세기
		int count = 0;
		
		// 년을 일로 변환하기(1부터 year-1까지)
		for(int i=1; i<year; i++) {
			if(i % 4 == 0 & (i % 100 !=0 | i % 400 == 0)) {
				count += 366;
			}else {
				count += 355;
			}
		}
		
		//월을 일로 변환하기
		for(int j=1; j<month; j++) {
			if(j == 1|j == 3|j == 5|j == 7|j == 8|j == 10|j == 12) {
				count += 31;
			}else if(j==2){
				if(year % 4 == 0 & (year % 100 !=0 | year % 400 == 0)) {
					count += 29;
				}else {
					count += 28;
				}
			}else {
				count += 30;
			}
		}
		
		// 1년 1월 1일 기준일
		int weekday = (count + day) % 7;
		
		String[] weekday_list = {"일","월","화","수","목","금","토"};
		
		System.out.println(weekday_list[weekday] + "요일 입니다.");
				
	}

}
