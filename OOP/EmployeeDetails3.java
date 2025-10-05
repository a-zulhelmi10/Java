//Avoid hard coded data
//Using This. reference
class EmployeeThird {
	int empNum, empNum2;
	String empName, empName2;
	int empSalary, empSalary2;

	// without this.reference
	void setEmpDetails(int empNum, String empName, int empSalary) {
		empNum = empNum; //without this. reference
		empName = empName;
		empSalary = empSalary;
	}

	void disEmpDetails() {
		System.out.println("Employee Number: " + empNum);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
	}

	// With this.reference
	void setEmpDetails2(int empNum2, String empName2, int empSalary2) {
		this.empNum2 = empNum2;
		this.empName2 = empName2;
		this.empSalary2 = empSalary2;
	}

	void disEmpDetails2() {
		System.out.println("Employee Number: " + empNum2);
		System.out.println("Employee Name: " + empName2);
		System.out.println("Employee Salary: " + empSalary2);
	}
}

public class EmployeeDetails3 { 
	public static void main(String[] args) {
		System.out.println("Without This. Reference");
		EmployeeThird e1 = new EmployeeThird(); 
			e1.setEmpDetails(1179,"Raju",3000); //pass value in argument to avoid hard coded
			e1.disEmpDetails();
		EmployeeThird e2 = new EmployeeThird(); 
			e2.setEmpDetails(1833, "Ravi", 3500);
			e2.disEmpDetails();
			System.out.println("");
		System.out.println("With this. Reference");
		EmployeeThird e3 = new EmployeeThird(); 
			e3.setEmpDetails2(1179,"Raju",3000); //pass value in argument to avoid hard coded
			e3.disEmpDetails2();



	}
}
