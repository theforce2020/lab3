package prob4B.main;

import prob4B.Shelter;

public class Admin {
	public static double computeTotalRent(Shelter[] properties) {
		double totalRent = 0;
		for (Shelter o : properties) {
			totalRent += o.computeRent();	
		}
		return totalRent;
	}
}