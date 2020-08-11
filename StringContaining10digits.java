package task6;

public class StringContaining10digits {
		public void myString(String str) {
		char[] arr= str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(arr[i] >= 48 && arr[i]<=57)
			{
				count++;
			}
		}
		if(count<10)
		{
			System.out.println("Invalid String");
		}
		else
			System.out.println("Valid String");
		}
		public static void main(String[] args)
		{
	    StringContaining10digits scm=new StringContaining10digits();
		scm.myString("Hello1234567890");
		
	    StringContaining10digits sc=new StringContaining10digits();
		sc.myString("123456789");
}
}
