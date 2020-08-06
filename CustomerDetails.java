package Task2;

public class CustomerDetails {
	String CUSTName;
	String CUSTEmail;
	static int CUSTID;
	static int CUSTMaterialID;
	static String CustomerMaterialName;
	String CUSTAddress;
void init() 
{
		 CUSTName="Jyothirmai";
		 CUSTEmail= "jyothi@gmail.com";
		 CUSTID=101010;
		 CUSTMaterialID=5500;
		 CustomerMaterialName="Iron";
		 CUSTAddress="Chennai";
}
void init1() 
{
		 CUSTName="Raghu";
		 CUSTEmail= "Raghu@gmail.com";
		 CUSTID=101011;
		 CUSTMaterialID=2500;
		 CustomerMaterialName="Copper";
		 CUSTAddress="Hyderabad";
}
void init2() 
{
		 CUSTName="Jaya";
		 CUSTEmail= "jaya@gmail.com";
		 CUSTID=101012;
		 CUSTMaterialID=25010;
		 CustomerMaterialName="Silicon";
		 CUSTAddress="Bangalore";
}
void init3() 
{
		 CUSTName="Ashok";
		 CUSTEmail= "ashok@gmail.com";
		 CUSTID=101013;
		 CUSTMaterialID=2000;
		 CustomerMaterialName="Nitrogen Mixture";
		 CUSTAddress="Vijayawada";
}
void init4() 
{
		 CUSTName="Sindhuja";
		 CUSTEmail= "Sindhuja@gmail.com";
		 CUSTID=101014;
		 CUSTMaterialID=200;
		 CustomerMaterialName="Sulphuric Acid";
		 CUSTAddress="Gujarat";
}
void disp() {
	System.out.println(" Cutomer Name is " +CUSTName);
	System.out.println(" Customer Email is "+CUSTEmail);
	System.out.println(" Customer Address is "+CUSTAddress);
}
static void disp1()
{
	System.out.println(" Cutomer ID is " +CUSTID);
	System.out.println(" Customer Material Number is "+CUSTMaterialID);
	System.out.println(" Customer Material Name is " +CustomerMaterialName);
	System.out.println("\n");
}
public static void main(String[] args)
{
	CustomerDetails c = new CustomerDetails();
	CustomerDetails c1 = new CustomerDetails();
	CustomerDetails c2 = new CustomerDetails();
	CustomerDetails c3 = new CustomerDetails();
	CustomerDetails c4 = new CustomerDetails();
	c.init();
	c.disp();
	disp1();
	c1.init1();
	c1.disp();
	disp1();
	c2.init2();
	c2.disp();
	disp1();
	c3.init3();
	c3.disp();
	disp1();
	c4.init4();
	c4.disp();
	disp1();
	
}
}

