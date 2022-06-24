package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employeesList = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int qnt = sc.nextInt();
		
		for(int i=0; i<qnt; i++) {
			System.out.print("Employee #" + (i+1) + ": \nId: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employeesList.add(new Employee(id, name, salary));
			
			System.out.println();
			
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idToIncreaseSalary = sc.nextInt();
		
		Employee matchingIds = employeesList.stream().filter(x -> x.getId() == idToIncreaseSalary).findFirst().orElse(null);
		
		if(matchingIds == null) {
			System.out.println("This id does not exist!");
		} else {
			
			for(Employee employee : employeesList) {
				
				if(employee.getId() == idToIncreaseSalary) {
					System.out.print("Enter the salary percentage: ");
					double percentage = sc.nextDouble();
					employee.setSalary(employee.salaryIncrease(percentage));
				}
			}
		}
		
		

				
			System.out.println("\nList of employees: ");
		for(Employee employee : employeesList) {
			System.out.println(employee.toString());
		}
		sc.close();
	}

}
