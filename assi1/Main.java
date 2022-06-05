package com.assi1;

public class Main {
	
	public static Employee getEmployeeDetails() {
		Employee emp = new Employee();	
		return emp;
	}
	
	
	public static int getPFPercentage(int per) {
	
		return per;
	}
	
	
	
	public static void main(String[] args) {
		
//		Main m = new Main();
		
		int pf = Main.getPFPercentage(7);
		
		Employee emp = Main.getEmployeeDetails();
		emp.setEmployeeName("Vivek");
		emp.setEmployeeId(101);
		emp.setSalary(20000.0);
		
		emp.calculateNetSalary(pf);
		
		System.out.println("Employee Id : " + emp.getEmployeeId());
		System.out.println("Name : " + emp.getEmployeeName());
		System.out.println("Salary : " + emp.getSalary());
		System.out.println("Salary : " + emp.getNetSalary());
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		Scanner input = new Scanner(System.in);
		
//		System.out.print("Enter Id:");
//		int id = input.nextInt();
//		
//		input.nextLine();
//		System.out.println("Enter Name:");
//		String name = input.nextLine();
//		
//		System.out.println("Enter Salary:");
//		double salary = input.nextDouble();
//		
//		System.out.println("Enter PF percentage:");
//		int pf = input.nextInt();
//		
//		Employee e1 = new Employee();
//		
//		e1.setEmployeeId(id);
//		e1.setEmployeeName(name);
//		e1.setSalary(salary);
		
//		Employee data = e1.getEmployeeDetails();
//				System.out.println(data);
		
//		System.out.println("Name:" + data.employeeName);
		
	
	}
}
