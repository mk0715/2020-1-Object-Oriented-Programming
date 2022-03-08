package oop_02_10;

public class Rectangle {
	// 너비
	int width;
	// 높이
	int height;
	
	// 넓이를 제공
	int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.width = 4;
		rec.height = 5;
		
		System.out.println(rec.getArea());
	}
}
