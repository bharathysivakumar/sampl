package ggg;

public class Person {
protected String name;

public Person(String name) {

	this.name = name;
}

public String getName() {
	return name;
}

@Override
public String toString() {
	return "Person [name=" + name + "]";
}
}

class Employee extends Person {
	private double annualsalary;
	private int yoj;
	private String insurance;
	public Employee(String name,double annualsalary, int yoj, String insurance) {
		super(name);
		this.annualsalary = annualsalary;
		this.yoj = yoj;
		this.insurance = insurance;
	}
	
	public double getAnnualsalary() {
		return annualsalary;
	}
	
	public int getYoj() {
		return yoj;
	}
	
	public String getInsurance() {
		return insurance;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [annualsalary=" + annualsalary + ", yoj=" + yoj + ", insurance=" + insurance + "]";
	}
	
	public static void main(String arg[]) {
		Employee e=new Employee("nila",5000000,2020,"sg235cvdh89");
		System.out.println(e);
	}
}