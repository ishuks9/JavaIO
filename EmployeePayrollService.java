import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	public List<EmployeePayrollData> employeePayrollList;

	public EmployeePayrollService() {
	}

	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeepayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeepayrollService.readEmployee(consoleInputReader);
		employeepayrollService.writeEmployee();
	}

	public void writeEmployee() {
		System.out.println("\nWriting employee Payroll to console\n" + employeePayrollList);
	}

	public void readEmployee(Scanner consoleInputReader) {
		System.out.println("Enter Id: ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter name: ");
		String name = consoleInputReader.next();
		System.out.println("Enter salary: ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}

}
