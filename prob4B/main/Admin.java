package prob4.main;

import prob4.Shelter;

public class Admin {
	public static double computeTotalRent(Shelter[] properties) {
		double totalRent = 0;
		for (Shelter o : properties) {
			totalRent += o.computeRent();	
		}
		return totalRent;
	}
}