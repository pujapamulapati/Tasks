package Task1;

public class EmployeeDetails 
{
String EmpName;
String EmpDesignation;
int EmpID;
int EmpSalary;
String EmpAddress;

void init() {
	 EmpName="Jyothirmai";
	 EmpDesignation= "Associate Professional";
	 EmpID=101010;
	 EmpSalary=25000;
	 EmpAddress="Chennai";
}

void init2() {
	EmpName="Vijaya";
	EmpDesignation= "Associate Professional";
	EmpID=101011;
	EmpSalary=25000;
	EmpAddress="Bangalore";
}
void init3() {
	EmpName="Raghu";
	 EmpDesignation= "Associate Professional";
	 EmpID=101012;
	 EmpSalary=25000;
	 EmpAddress="Chennai";
}
void init4() {
	 EmpName="Ashok";
	 EmpDesignation= "Associate Professional";
	 EmpID=101013;
	 EmpSalary=25000;
	 EmpAddress="Vijayawada";
}
void init5() {
	EmpName="Jaya";
	 EmpDesignation= "Associate Professional";
	 EmpID=101014;
	 EmpSalary=25000;
	 EmpAddress="Hyderabad";
}

void disp() {
	System.out.println(" Employee Name is " +EmpName);
	System.out.println(" Employee Designation is "+EmpDesignation);
	System.out.println(" Employee ID is " +EmpID);
	System.out.println(" Employee Salary is "+EmpSalary);
	System.out.println(" Employee Address is "+EmpAddress);
	
}
public static void main(String[] args)
{
	
	EmployeeDetails e = new EmployeeDetails();
	EmployeeDetails e1 = new EmployeeDetails();
	EmployeeDetails e2 = new EmployeeDetails();
	EmployeeDetails e3 = new EmployeeDetails();
	EmployeeDetails e4 = new EmployeeDetails();
	e.init();
	e.disp();
	e1.init2();
	e1.disp();
	e2.init3();
	e2.disp();
	e3.init();
	e3.disp();
	e4.init();
	e4.disp();

}

}

