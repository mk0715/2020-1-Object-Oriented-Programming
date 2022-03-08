package oop_02_11;

public class Circle implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14 * this.radius;
	}
	public static void main(String[] args) {
		Circle[] c = new Circle[5];
		for (int i=0; i<c.length; i++) {
			c[i] = new Circle(i);
		}
		for (int i=0; i<c.length; i++) {
			System.out.println((int)(c[i].getArea())+" ");
		}
	}

}
