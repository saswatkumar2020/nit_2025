package javabasics;

class Person{
	String name="Jhon Doe";
	int age=30;
	
	void displayDetails() {
		System.out.println("Person Details:");
		System.out.println("Name"+name);
		System.out.println("Age"+age);
	}
}

class Employee extends Person{
	int employeeId=12345;
	String department="IT";
	
	void displayEmployeeDeatails() {
		System.out.println("Employee Details:");
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Department:"+department);
		
	}
}
public class Saswat {

	public static void main(String[] args) {
		Employee e=new Employee();
		
		e.displayEmployeeDeatails();
		e.displayDetails();
		System.out.println("Hello World");
	}

}
