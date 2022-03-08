package oop_02_18;

public class B extends A {
	
	int x;
	int y;
	
	B(int x){
		super(x);
		System.out.println("나는 B의 생성자입니다.");
	}
	
	B(int x, int y){
		super(y);
		System.out.println("나는 B의 생성자입니다.");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
