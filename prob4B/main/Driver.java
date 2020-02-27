package prob4B.main;

import prob4B.Condo;
import prob4B.House;
import prob4B.Shelter;
import prob4B.Trailer;

public class Driver {

	public static void main(String[] args) {
		Shelter[] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}