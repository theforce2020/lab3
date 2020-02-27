package prob3Composition;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder = new Cylinder(6.1, 3.5);
		cylinder.computeVolume();
		System.out.println(cylinder.computeVolume());
		Circle circle =new Circle (5.2);
		circle.computeArea();
		System.out.println(circle.computeArea());

	}

}
