class Point {
	int x;
	int y;

	static final int MAX_COORDINATE_X = 10;
	static final int MAX_COORDINATE_Y = 10;

	boolean isOk = false;
	
	public Point() {
	}

	public Point(int x, int y) {
		if (x <= MAX_COORDINATE_X && y <= MAX_COORDINATE_Y) {
			this.x = x;
			this.y = y;
			isOk = true;
		}
	}

	public String toString() {
		if (this.isOk) {
			return "My x: " + this.x + " and my y: " + this.y;
		} else {
			return "The entered value is extending the allowed scope: x<=10 and y<=10";
		}
	}
}

public class AppPoint {

	public static void main(String[] args) {
		Point point1 = new Point(4, 6);
		System.out.println(point1.toString());
		System.out.println(point1);

		Point point2 = new Point(8, 11);
		System.out.println(point2.toString());
		System.out.println(point2);
		
		Point point3 = new Point(10,10);
		System.out.println(point3.toString());
		System.out.println(point3);
		
	}
}
