package oop_02_19;

class Point {
	private int x,y;
	
	Point(int x, int y){
		set(x,y);
	}
	
	void set(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}

}
