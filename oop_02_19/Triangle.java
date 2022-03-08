package oop_02_19;

class Triangle extends Shape{
	
	double calculateArea() {
		return width * height / 2;
	}
	
	public String toString() {
		return "Triangle: " + "width = " + width + "height = " + height + " color = " + color;
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
