package Task1;
//import java.util.Scanner;
public class AddNumbers 
{
 public static void main(String args[])
 {
	 System.out.println("Argument one = "+args[0]);
     System.out.println("Argument two = "+args[1]);
     int sum;
    sum = (Integer.parseInt(args[0])) + (Integer.parseInt(args[1]));
     System.out.println("Sum ="+sum);
 }
}