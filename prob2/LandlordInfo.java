package prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	List<Building> buildings;

	public LandlordInfo() {
		this.buildings = new ArrayList<Building>();
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}
	
	public void addBuilding(Building b) {
		buildings.add(b);
	}
	
	public double calcProfits() {
		double totalProfit = 0;
		for(Building b : buildings) {
			totalProfit += b.getProfilt();
		}
		return totalProfit;
	}
}
