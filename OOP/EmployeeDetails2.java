//Avoid hard coded data
class EmployeeSec {
	int empNum;  
	String empName;
	int empSalary;

	void setEmpDetails(int eNo, String eName, int eSalary) {
		empNum = eNo; 
		empName = eName;
		empSalary = eSalary;
	}

	void disEmpDetails() {
		System.out.println("Employee Number: " + empNum); 
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
	}

}

public class EmployeeDetails2 { 
	public static void main(String[] args) {
		EmployeeSec e1 = new EmployeeSec(); 
			e1.setEmpDetails(1179,"Raju",3000); //pass value in argument to avoid hard coded
			e1.disEmpDetails();
		EmployeeSec e2 = new EmployeeSec();
			e2.setEmpDetails(1833, "Ravi", 3500);
			e2.disEmpDetails();
		
		

	}
}
