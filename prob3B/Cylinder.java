package prob3Composition;

public class Cylinder  {
	private double height;
	private double radius;
	private Circle circle;
	public Cylinder(double hei, double radi) {
		height = hei;
		radius = radi;
		circle=new Circle(radius);
	}

	
	public double getHeight() {
		return height;
	}

	public double getRadius() {
		return radius;
	}
	
	public Circle getCircle(){
		return circle;
	}
	public double computeVolume() {
		return Math.PI * radius * radius * height;
	}

}

