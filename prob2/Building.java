package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	List<Apartment> apartments;
	
	double maintenance1;
	
	double maintenance2;
	
	public Building(double maintenance1, double maintenance2) {
		this.apartments = new ArrayList<Apartment>();
		this.maintenance1 = maintenance1;
		this.maintenance2 = maintenance2;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(List<Apartment> apartments) {
		this.apartments = apartments;
	}
	
	public void addApartment(Apartment a) {
		apartments.add(a);
	}
	
	public double getProfilt() {
		double totalRent = 0;
		for(Apartment ap : apartments) {
			totalRent += ap.getRent();
		}
		return totalRent - (maintenance1 + maintenance2);
	}
}
