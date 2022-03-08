package oop_02_11;

public class ValuePassing {
	int increase(int m) {
		return m+1;
	}
	public static void main(String[] args) {
		int n= 10;
		ValuePassing vp = new ValuePassing();
		n = vp.increase(n);
		System.out.println(n);
	}

}
