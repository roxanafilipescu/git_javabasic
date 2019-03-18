package teme;

public class EmployeeClient {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Ion", 27, 1000, null);
		Employee emp2 = new Employee("Ghita", 27, 2000, null);
		Employee emp3 = new Employee("Maria", 31, 1500, null);
		Employee emp4 = new Employee("Dan", 40, 100, null);
		Employee emp5 = new Employee("Mircea", 39, 3999, null);
		Employee emp6 = new Employee("Vlad", 25, 1475, null);

		Employee[] emp = { emp1, emp2, emp3, emp4, emp5, emp6 };

		EmployeeClient employeeClient = new EmployeeClient();
		Employee empSalaryMax = employeeClient.maximumSalaryEmployee(emp);
		empSalaryMax.show();
		Employee empSalaryMin = employeeClient.minimumSalaryEmployee(emp);
		empSalaryMin.show();
		double mediumSalary = employeeClient.mediumSalary(emp);
		System.out.println(mediumSalary);
		int mediumAge = employeeClient.mediumAge(emp);
		System.out.println(mediumAge);
		Employee empAgeMin = employeeClient.minimumAgeEmployee(emp);
		empAgeMin.show();
	}

	public Employee maximumSalaryEmployee(Employee[] empSalary) {
		int salary = 0;
		Employee empTemp = empSalary[0];
		for (Employee emp : empSalary) {
			if (emp.getSalary() > salary) {
				salary = emp.getSalary();
				empTemp = emp;
			}
		}

		return empTemp;
	}

	public Employee minimumSalaryEmployee(Employee[] empSalary) {
		int salary = Integer.MAX_VALUE;
		Employee empTemp = empSalary[0];
		for (Employee emp : empSalary) {
			if (emp.getSalary() < salary) {
				salary = emp.getSalary();
				empTemp = emp;
			}
		}

		return empTemp;
	}

	public double mediumSalary(Employee[] empSalary) {
		int mediumSalary = 0;
		for (Employee emp : empSalary) {
			mediumSalary += emp.getSalary();

		}

		return mediumSalary / empSalary.length;
	}

	public int mediumAge(Employee[] empAge) {
		int mediumAge = 0;
		for (Employee emp : empAge) {
			mediumAge += emp.getAge();

		}

		return mediumAge / empAge.length;
	}

	public Employee minimumAgeEmployee(Employee[] empAge) {
		int age = Integer.MAX_VALUE;
		Employee empTemp = empAge[0];
		for (Employee emp : empAge) {
			if (emp.getAge() < age) {
				age = emp.getAge();
				empTemp = emp;
			}
		}

		return empTemp;
	}
}
