package oop_02_19;

class Circle extends Shape{
	final static double pi = 3.141592;  // final로 고칠수 없게 만들어버림.
	
	double calculateArea() {
		return pi * width * width;
	}
	
	public String toString() {
		return "Circle: " + "radius = " + width + " color = " + color;
	}
	
	int countSizeParameters() {
		return 1;
	}
	
	@Override
	void changeSize(int width, int height) {
		System.out.println("지원하지 않는 기능입니다.");
	}

	@Override
	void changeSize(int radius) {
		this.width = radius;
	}

}
