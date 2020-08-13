package task8;


public class ReverseString
{
	String myString(String str)
	{
		String a="";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			a=a+str.charAt(i);
		}
		String newStr=new String(a);
		return newStr;
	}
	public static void main(String[] args){
		ReverseString scm=new ReverseString();
		String data=scm.myString("Hello World");
		System.out.println(data);
}
}