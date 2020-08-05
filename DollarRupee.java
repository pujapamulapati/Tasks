package Task1;
import java.util.Scanner;
public class DollarRupee 
{
	public static void main(String[] args) 
	{
		float dollars;
		float f1=(float)74.84;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter dollars:");
		dollars = in.nextLong();
		float rupees = dollars * f1;
		in.close();
		System.out.println(rupees + " Rupees");
	}
}

