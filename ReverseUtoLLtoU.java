package task8;

public class ReverseUtoLLtoU {
	String myString(String str)
	{
		String a="";
		int b;
		char[] ar= str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			a=a+str.charAt(i);
		}
		String Str=new String(a);
		char[] arr= Str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				b=arr[i];
				b=b+32;
				arr[i]=(char) b;
			}
		}
		for(int j=0;j<str.length();j++)
		{
		if(ar[j]>='A' && ar[j]<='Z')
		{
			if(arr[j]>='a' && arr[j]<='z')
			{
				b=arr[j];
				b=b-32;
				arr[j]=(char) b;
			}
			
		}
		}
		String newStr=new String(arr);
		return newStr;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	      ReverseUtoLLtoU scm=new ReverseUtoLLtoU();
		  String data=scm.myString("HeLloWorld");
	 	 System.out.println(data);
	      ReverseUtoLLtoU sc=new ReverseUtoLLtoU();
		  String dat=sc.myString("MyJavaWorld");
	 	 System.out.println(dat);
	}
}

