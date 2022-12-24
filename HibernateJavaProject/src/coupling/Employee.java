package coupling;

public class Employee {
	Address address;

// tight coupling
	public Employee() {
		address = new Address();
	}

//lose coupling
	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public static void main(String[] args) {
		// tight coupling
//		Employee emp = new Employee();
//		emp.address.setLocation("cxzc");
//		emp.address.setPincode(532445);
//		System.out.println(emp);
		Address ads = new Address();
		ads.setLocation("dsfxf");
		Employee emp = new Employee(ads);
		emp.address.setPincode(1);
		System.out.println(emp);
	}
}
