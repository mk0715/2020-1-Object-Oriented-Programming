package oop_02_19;

abstract class Shape { // 슈퍼 클래스
	Point p = new Point(100,100);
	String color = "Blue";
	int width = 10, height = 10;
	
	void move(Point p) {
		this.p = p;
	}
	
	void changecolor(String color) {
		this.color = color;
	}
	
	abstract double calculateArea();
	
	int countSizeParameters() {
		return 2;
	}
	
	abstract void changeSize(int width, int height);
	
	abstract void changeSize(int radius);

}
