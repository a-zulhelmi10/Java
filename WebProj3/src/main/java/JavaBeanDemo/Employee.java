package JavaBeanDemo;

public class Employee {
	private int eNo;
	private String eName;
	private double salary;
	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//after that refer to empForm.html 
//also refer to RecordsEmployee.jsp
}
