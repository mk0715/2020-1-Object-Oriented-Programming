package oop_02_19;

import java.util.Scanner;

import oop_02_19.Paint.ShapeType;

public class PaintEx {
	static Scanner scanner;
	static Paint p;
	
	public static void createShape() {
		System.out.println("아래 메뉴 중 선택하세요.");
		System.out.println("1. 삼각형 ");
		System.out.println("2. 원 ");
		System.out.println("3. 사각형 ");
		
		switch(scanner.nextInt()) {
		case 1:
			p.CreateShape(ShapeType.TRIANGLE);
			break;
		case 2:
			p.CreateShape(ShapeType.CIRCLE);
			break;
		case 3:
			p.CreateShape(ShapeType.RECTANGLE);
			break;
		}
	}
	
	public static void moveShape() {
		System.out.println(p.showShapeList());
		System.out.println("이동할 도형을 선택하세요.");
		int index = scanner.nextInt();
		System.out.println("수평으로 이동할 위치를 입력하세요.");
		int x = scanner.nextInt();
		System.out.println("수직으로 이동할 위치를 입력하세요.");
		int y =scanner.nextInt();
		
		p.move(index, x, y);
	}
	
	public static void changeSize() {
		System.out.println(p.showShapeList());
		System.out.println("사이즈를 변경할 도형을 선택하세요.");
		int index = scanner.nextInt();
		
		int count = p.countSizeParameters(index);
		
		if (count == 2) {
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			p.changeSize(index, width, height);
		}else {
			int radius = scanner.nextInt();
			p.changeSize(index, radius);
		}
	}
	
	public static void changeColor() {
		System.out.println(p.showShapeList());
		System.out.println("색상 변경할 도형을 선택하세요.");
		int index = scanner.nextInt();
		System.out.println("변경할 색상을 입력하세요.");
		String x = scanner.next();
		
		p.changeColor(index, x);
	}
	
	public static void calculateArea() {
		System.out.println(p.showShapeList());
		System.out.println("넓이 구할 도형을 선택하세요.");
		int index = scanner.nextInt();
		
		System.out.println(p.calculateArea(index));
	}
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		p = new Paint();
		
		while(true) {
			System.out.println("아래 메뉴 중 선택하세요.");
			System.out.println("1. 도형 생성 ");
			System.out.println("2. 이동 ");
			System.out.println("3. 색상 변경 ");
			System.out.println("4. 넓이 구하기 ");
			System.out.println("5. 사이즈 변경");
			System.out.println("6. 종료 ");
			
			switch (scanner.nextInt())
			{
			case 1: 
				createShape();
				break;
			case 2:
				moveShape();
				break;
			case 3:
				changeColor();
				break;
			case 4:
				calculateArea();
				break;
			case 5:
				changeSize();
				break;
			case 6:
				scanner.close();
				return;
			}
			System.out.println(p.showShapeList());
		}
		
	}

}
