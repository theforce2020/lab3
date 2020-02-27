package prob4B;

public class Condo extends Shelter {
	int numFloors;

	public Condo(int i) {
		super();
		setNumFloors(i);
	}
	
	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	@Override
	public double computeRent() {
		rent = 400 * numFloors;
		return rent;
	}
}