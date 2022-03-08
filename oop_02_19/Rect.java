package oop_02_19;

class Rect extends Shape{
	
	public String toString() {
		return "Rect: " + "width = " + width + "height = " + height + " color = " + color;
	}

	@Override
	double calculateArea() {
		return width * height;
	}

	@Override
	void changeSize(int width, int height) {
		this.width = width;
		this.height = height;	
	}

	@Override
	void changeSize(int radius) {
		System.out.println("지원하지 않는 기능입니다.");
	}
}
