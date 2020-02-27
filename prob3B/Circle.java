package prob3B;


public class Circle {
	
	private double radius;


	public double getRadius() {
		return this.radius;
	}
	
	public Circle(double ra){
		this.radius= ra;
	}
	
	public double computeArea() {
		return Math.PI * Math.sqrt(this.radius);
	}
}
