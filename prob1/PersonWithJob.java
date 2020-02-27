package prob1;

public class PersonWithJob {
	Person person;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	
	PersonWithJob(String n, double s) {
		salary = s;
		person = new Person(n);
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		return this.person.equals(aPerson);
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
