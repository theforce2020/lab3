package prob4;

public class Trailer extends Shelter {

	public Trailer() {
		super(500);
	}

	@Override
	public double computeRent() {
		return rent;
	}
}