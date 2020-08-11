package Task5;
public class StringModifyCertainPosition {
	String mySubString(String str , int StartIndex , int StopIndex)
	{
		String a="";
		char[] arr= str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if (i>=StartIndex && i<=(StartIndex+StopIndex-1)) {
				continue;
			}
			else
				a=a+arr[i];
		}
		String newStr=new String(a);
		return newStr;
	}
	public static void main(String[] args)
	{
		StringModifyCertainPosition scm=new StringModifyCertainPosition();
		String data=scm.mySubString("Hello World",2,2);
		System.out.println(data);

		}
		}