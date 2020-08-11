package task6;


public class StringContainNumbersOnly {
	public void myString(String str)
	{
	char[] arr= str.toCharArray();
	int length=str.length();
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(arr[i]>= 48 && arr[i]<=57)
		{
			count++;
		}
	}
	if(count!=length)
	{
		System.out.println("Invalid String");
	}
	else
		System.out.println("Valid String");
	}
	public static void main(String[] args)
	{
        StringContainNumbersOnly scm=new StringContainNumbersOnly();
		 scm.myString("Hello");
	
		 StringContainNumbersOnly sc=new StringContainNumbersOnly();
		 sc.myString("123456789");
		

		}
	}
