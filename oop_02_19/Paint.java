package oop_02_19;

public class Paint {
	Shape[] shapes = new Shape[10];
	// 0, 1
	// 1, 2
	// 2, 3
	// 3, 4
	// ....
	
	int count = 0;
	
	enum ShapeType{
		TRIANGLE,
		CIRCLE,
		RECTANGLE
	};
	
	// 생성
	void CreateShape(ShapeType type) {
		switch(type){
			case TRIANGLE:
				shapes[count] = new Triangle();
				break;
			case CIRCLE:
				shapes[count] = new Circle();
				break;
			case RECTANGLE:
				shapes[count] = new Rect();
				break;
		}
		count++;
	}
	
	// 조회
	String showShapeList() {
		String result = "";
		for (int i=0; i<count; i++) {
			result += i + 1 + ":";
			result += shapes[i].toString();
			result += '\n';
		}
		return result;
	}
	
	// 이동
	void move(int index, int x, int y) {
		Point p = new Point(x,y);
		shapes[index - 1].move(p);
	}
	
	// 색상 변경
	void changeColor(int index, String color) {
		shapes[index - 1].changecolor(color);
	}
	
	// 넓이 구하기
	double calculateArea (int index) {
		return shapes[index - 1].calculateArea();
	}
	
	// 사이즈 변경
	void changeSize(int index, int width, int height) {
		if (shapes[index - 1] instanceof Rect) {
			((Rect)shapes[index - 1]).changeSize(width,height);
		}
		else if (shapes[index - 1] instanceof Triangle) {
			((Triangle)shapes[index - 1]).changeSize(width,height);
		}
	}
	
	void changeSize(int index, int radius) {
		if (shapes[index - 1] instanceof Circle) {
			((Circle)shapes[index - 1]).changeSize(radius);
		}
	}
	
	int countSizeParameters(int index) {
		return shapes[index - 1].countSizeParameters();
	}
}
