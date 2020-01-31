public class EmployeeTest {
	public static void main(String[] args) {
		Employee myEmployee1 = new Employee("Catalina", "MacOS", 78);
		Employee myEmployee2 = new Employee("Sierra", "MacOS", -80);
		EmployeeTest.printEmployeeInfo(myEmployee1);
		EmployeeTest.printEmployeeInfo(myEmployee2);
		myEmployee1.setSalary(myEmployee1.getSalary()*1.1);
		myEmployee2.setSalary(myEmployee2.getSalary()*1.1);
		System.out.println("Raise 10%");
		EmployeeTest.printEmployeeInfo(myEmployee1);
		EmployeeTest.printEmployeeInfo(myEmployee2);
	}
	public static void printEmployeeInfo(Employee employee) {
		System.out.printf("Employee Info\n name: %s\n Last name: %s\n salary: %.3f\n", employee.getFirstName(), employee.getLastName(), employee.getSalary());
		System.out.printf("The anual Salary for Employee is:%.3f \n", employee.getAnualSalary());
		System.out.println("-------------------------------------------");
	}
}
