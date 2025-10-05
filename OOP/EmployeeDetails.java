class Employee {
	int empNum;  
	String empName;
	int empSalary;

	void setEmpDetails() {
		empNum = 1179;  //hard coded data (Assign value directly to data members)
		empName = "Raju";
		empSalary = 3000;
	}

	void disEmpDetails() {
		System.out.println("Employee Number: " + empNum); 
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
	}

}

public class EmployeeDetails { // to run java program
	public static void main(String[] args) {
		Employee e1 = new Employee(); //create a new memory for object e1
			e1.setEmpDetails();
			e1.disEmpDetails();
		Employee e2 = new Employee();
			e2.disEmpDetails();
		System.out.println(e1.empNum);
		
		

	}
}
