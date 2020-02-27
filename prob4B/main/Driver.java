package prob4.main;

import prob4.Condo;
import prob4.House;
import prob4.Shelter;
import prob4.Trailer;

public class Driver {

	public static void main(String[] args) {
		Shelter[] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}