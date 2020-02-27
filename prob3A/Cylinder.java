package prob3A;

public class Cylinder  {
	/*
	 * private double height; private double radius;
	 * 
	 * public Cylinder(double height, double radius) { this.height = height;
	 * this.radius = radius; }
	 * 
	 * 
	 * public double getHeight() { return height; } public void setHeight(double h)
	 * { height = h; } public double getRadius() { return radius; } public void
	 * setRadius(double r) { radius = r; } public double computeVolume() { return
	 * Math.PI * radius * radius * height; }
	 */
	
	private double height;
	private double radius;
	
	
	public double getHeight() {
		return this.height;
	}
	
	public Cylinder (double ra){
		this.radius=ra;
		this.height= 0;
	}
	
	public Cylinder(double ra,double h) {
		this.radius=ra;
		this.height= h;
	}
	
	public double computeVolume() {
	
		return  Math.PI * Math.sqrt(this.radius)* this.height; 
	}
	

}

