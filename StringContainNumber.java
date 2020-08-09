package task4;

public class StringContainNumber {

boolean StringNumber(String str)
{
	char[] arr=str.toCharArray();
	for(int i=0;i<str.length();i++)
		{
		if(arr[i]>= 48 && arr[i]<=57)
		return true;
		}
		return false;
		}
	public static void main(String[] args) {
	StringContainNumber scm=new StringContainNumber();
	boolean data=scm.StringNumber("pujA736");
	System.out.println(data);
	System.out.println("\n");
	StringContainNumber sc=new StringContainNumber();
	boolean data1=sc.StringNumber("puja");
	System.out.println(data1);
	}
	
}