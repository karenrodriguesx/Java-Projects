package entities;

public class Salary {
	public String name;
	public double grossSalary; //salario bruto
	public double tax; //imposto
	
	public double netSalary() { //salario liquido
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	
}
