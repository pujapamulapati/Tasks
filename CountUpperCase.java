package task4;

public class CountUpperCase 
{
	int CountUpperCaseOnly(String str)
	{
		int count=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
		if(arr[i]>= 65 && arr[i]<=90)
		count++;
		}
		return count;
		}
	public static void main(String[] args) {

	CountUpperCase scm=new CountUpperCase();
	int data=scm.CountUpperCaseOnly("PUJA");
	System.out.println(data);
	System.out.println("\n");
	CountUpperCase sc=new CountUpperCase();
	int data1=sc.CountUpperCaseOnly("pujA");
	System.out.println(data1);
	}
	
}