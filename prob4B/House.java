package prob4B;

public class House extends Shelter {
	double lotSize;
	
	public House(int i) {
		super();
		setLotSize(i);
	}
	
	public double getLotSize() {
		return lotSize;
	}

	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}

	@Override
	public double computeRent() {
		rent = 0.1 * lotSize;
		return rent;
	}
}