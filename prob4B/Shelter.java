package prob4B;

public abstract class Shelter {
	double rent;
	
	public Shelter() {
		super();
	}

	public Shelter(double i) {
		this.rent = i;
	}
	
	public double getRent() {
		return rent;
	}
	
	public abstract double computeRent();
}