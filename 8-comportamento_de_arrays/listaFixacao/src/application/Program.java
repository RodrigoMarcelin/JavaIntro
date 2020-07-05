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
		Integer n, id;
		String name;
		Double salary, percent;
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Employee #%d:%n", i + 1);
			System.out.println("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			name = sc.nextLine();
			System.out.println("Salary: ");
			salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.println("Enter the employee id that will have salary increase : ");
		int id2;
		id2 = sc.nextInt();
		sc.nextLine();
		
		Employee emp = list.stream().filter(x -> x.getId() == id2).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id is not exist");
		} else {
			System.out.println("Enter the percentage: ");
			percent = sc.nextDouble();
			emp.percent(percent);
		}
		
		System.out.println("List of employees");
		for(Employee e : list) {
			System.out.println(e);
		}
		sc.close();
		
		
	}
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
