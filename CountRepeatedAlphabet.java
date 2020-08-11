package Task5;

public class CountRepeatedAlphabet {
	public void myStr(String str)
	{
		int count=0,max=0;
		char[] arr=str.toCharArray();
	    char a=' ';
	    char b=' ';
		for(int i=0;i<str.length();i++)
		{
             count=0;
			for(int j=0;j<str.length()-i;j++)
			{
				if(arr[i] == arr[i+j])
				{
				 count++;
				 a=arr[i];
				}
		}
		if(max<count)
		{
		   max=count;
		   b=a;
		}
		}
		System.out.println(max+ " " +b);
}
	public static void main(String[] args)
	{
	CountRepeatedAlphabet scm=new CountRepeatedAlphabet();
	 scm.myStr("HelloWorld");

		}
		}


