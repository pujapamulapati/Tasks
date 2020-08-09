package task4;

public class TwoStringCheck 
{
boolean isEqual(String str1 , String str2)
{
	char[] arr1=str1.toCharArray();
	char[] arr2=str2.toCharArray();
	if(arr1.length==arr2.length)
	{
		for(int i=0;i<str1.length();i++) 
		{
			if( !(arr1[i]==arr2[i] || arr1[i]==(arr2[i]+32) || arr1[i]==(arr2[i]-32)))
			{
				return false;
				}
			}
		}
	else
		return false;
	return true;
}
public static void main(String[] args)
{
	TwoStringCheck scm=new TwoStringCheck();
	boolean data=scm.isEqual("puja","PUJA");
	System.out.println(data);
	TwoStringCheck sc=new TwoStringCheck();
	boolean data1=sc.isEqual("puja","PUJP");
	System.out.println(data1);
}
}
