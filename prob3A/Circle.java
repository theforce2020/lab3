package prob3A;

public class Circle extends Cylinder {
	
	//super(radius).... error : more explained on readme.txt
	
	private double radius;


	public double getRadius() {
		return this.radius;
	}
	
	Circle(double ra){
		super(ra);
		this.radius= ra;
		
	}
	
	public double computeArea() {
		return Math.PI * Math.sqrt(this.radius);
	}
}
	

	
	


