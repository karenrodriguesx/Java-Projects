package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import entities.*;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	// recebendo os dados do trabalhador
			System.out.print("Enter department's name: ");
			String departmentName = sc.nextLine();
			
			System.out.println("\nEnter worker data: ");
			
			System.out.print("Name: ");
			String workerName = sc.nextLine();
			
			System.out.print("Level: ");
			String level = sc.nextLine();
			
			System.out.print("Base Salary: ");
			double baseSalary = sc.nextDouble();
	// instanciando novo objeto worker, necessário instanciar o department
			Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, new Department (departmentName));
		// recebendo os dados dos contratos	
			System.out.print("\nHow many contracts to this worker? ");
			int n = sc.nextInt();
			
			for (int i=1 ; i <= n ; i++ ) {
				System.out.println("\nEnter contract " + i + " data:");
				System.out.print("Date (dd/MM/yyyy): ");
				Date contractDate = sdf.parse(sc.next());
						
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				
				System.out.print("Duration (hours): ");
				int hours = sc.nextInt();
				
				HourContract contract = new HourContract (contractDate, valuePerHour, hours);
				worker.addContract(contract);
			}
			
			System.out.print("\nEnter the month and year to calculate income (MM/yyyy): ");
			// necessario recortar como substring o mes e ano
			String monthAndYear = sc.next();
			int month = Integer.parseInt(monthAndYear.substring(0, 2)); //recortando o mes da posicao 0 a 1, porem necessario sempre colocar uma posicao a mais
			int year = Integer.parseInt(monthAndYear.substring(3)); //recortando o ano da posicao 3 em diante
			
			System.out.println("Name: " + worker.getName());
			System.out.println("Department: " + worker.getDepartment().getName());
			System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
			
		sc.close();
	}

}
