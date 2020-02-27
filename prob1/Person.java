package prob1;


public class Person {

	private String name;

	Person(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		boolean isEqual = false;

		if(aPerson instanceof PersonWithJob) {
			PersonWithJob p = (PersonWithJob)aPerson;
			isEqual = this.name.equals(p.getPerson().name);
		} else if(aPerson instanceof Person) {
			Person p = (Person)aPerson;
			isEqual = this.name.equals(p.name);
		}
		return isEqual;
	}

	public static void main(String[] args) {

	}
}