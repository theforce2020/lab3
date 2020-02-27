package prob3inherit;

public class Circle extends Cylinder {
	
	public Circle(double radius){
		super(radius, 0);//super(radius).... error : more explained on readme.txt
	}
	
	public double computeArea() {
		return getRadius() * getRadius() * Math.PI;
	}
}
	

	
	


