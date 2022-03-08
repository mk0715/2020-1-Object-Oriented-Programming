package oop_02_02;

public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.141592;
		
		double radious = 10.0;
		
		double CircleArea = radious * radious * PI;
		System.out.println(CircleArea); // 가독성 측면에서 이 코드가 밑에 코드보다 좋음.
		
		System.out.println(radious * radious * PI);
	}

}
