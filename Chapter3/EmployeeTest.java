public class EmployeeTest {
	public static void main(String[] args) {
		Employee myEmployee1 = new Employee("Catalina", "MacOS", 78);
		Employee myEmployee2 = new Employee("Sierra", "MacOS", -80);
		System.out.printf("Employee1 Info\n name: %s\n Last name: %s\n salary: %.3f\n", myEmployee1.getFirstName(), myEmployee1.getLastName(), myEmployee1.getSalary());
		System.out.printf("The anual Salary for Employee1 is:%.3f \n", myEmployee1.getAnualSalary());
		myEmployee1.setSalary(myEmployee1.getSalary()*1.1);
		System.out.printf("The Salary for Employee1 is goint to be: %.3f , if the salary raised up 10percent \n", myEmployee1.getSalary());
		System.out.printf("Employee2 Info\n name: %s\n Last name: %s\n salary: %.3f\n", myEmployee2.getFirstName(), myEmployee2.getLastName(), myEmployee2.getSalary());
		System.out.printf("The anual Salary for Employee2 is: ", myEmployee2.getAnualSalary());
		myEmployee2.setSalary(myEmployee2.getSalary()*1.1);
		System.out.printf("The Salary for Employee2 is goint to be: %.3f , if the salary raised up 10percent \n", myEmployee2.getSalary());
	}
}