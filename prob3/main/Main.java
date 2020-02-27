package prob3.main;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prob3A.Cylinder cInher = new prob3A.Cylinder(4,10); 
		prob3B.Cylinder cCompo  = new  prob3B.Cylinder(4,10);
		
		System.out.println("Volume Cylinder inheritance: "+cInher.computeVolume()+" Volume of the Cylinder Composition is: "+cCompo.computeVolume());

		
	}

}
