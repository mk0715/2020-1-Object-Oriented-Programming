package oop_02_10;

public class Rectangle2 {
	// 너비
	private int width;
	// 높이
	private int height;
	
	Rectangle2(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	// 넓이를 제공
	int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Rectangle2 rec = new Rectangle2(4,5);
		System.out.println(rec.getArea());
	}
}
