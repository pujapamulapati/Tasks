package task4;

public class StringUpperCaseOnly 
{
	boolean UpperCaseOnly(String str)
	{
		int count=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
		if(arr[i]>= 65 && arr[i]<=90)
		count++;
		}
		if(count==str.length())
		{
		return true;
		}
		return false;
		}
	public static void main(String[] args) {

	StringUpperCaseOnly scm=new StringUpperCaseOnly();
	boolean data=scm.UpperCaseOnly("PUJA");
	System.out.println(data);
	System.out.println("\n");
	StringUpperCaseOnly sc=new StringUpperCaseOnly();
	boolean data1=sc.UpperCaseOnly("pujA");
	System.out.println(data1);
	}
	
}