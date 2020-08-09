package task4;


public class UpperCaseString 
{
	String UpperCase(String str)
	{
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
		if(arr[i]>= 65 && arr[i]<=90)
		return "YES";
		}
		return "NO";
	}
	public static void main(String[] args) {

	UpperCaseString scm=new UpperCaseString();
	String data=scm.UpperCase("pujA");
	System.out.println(data);
	System.out.println("\n");
	UpperCaseString sc=new UpperCaseString();
	String data1=sc.UpperCase("puja");
	System.out.println(data1);
	}
	
}
