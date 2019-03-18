package teme;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private Employee manager;
	// private Employee[] employees = new Employee[0];

	public Employee(String name, int age, int salary, Employee manager) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.manager = manager;
	}

	public void show() {
		System.out.println(name + " " + age + " " + salary + " " + (manager != null ? manager.name : "--"));
	}

	public int getSalary() {
		return this.salary;
	}

	public int getAge() {
		return this.age;
	}
}
