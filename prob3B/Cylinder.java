package prob3B;


public class Cylinder  {
	private Circle circle;
	private double height;
	//private double radius;
	
	
	public double getHeight() {
		return this.height;
	}
	
	public Cylinder(double ra,double h) {
		//this.radius=ra;
		this.height= h;
		this.circle = new Circle(ra);
	}
	
	public double computeVolume() {
	
		return this.circle.computeArea()* this.height; 
	}
	
	

}

