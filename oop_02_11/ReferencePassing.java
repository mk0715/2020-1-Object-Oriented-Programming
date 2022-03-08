package oop_02_11;

public class ReferencePassing {
	static void increase(Circle m) {
		m.radius++;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		try {
			increase((Circle)pizza.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pizza.radius);
	}

}
