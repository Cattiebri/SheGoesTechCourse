package arrayobjects;

public class MyCircle extends MyPoint {

	private MyPoint center;
	private int radius;

	public MyCircle() {

	}

	public MyCircle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
