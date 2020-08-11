package Task5;

public class RemovecharInString 
{
	String mySubString(String str , int index) {
	String a="";
	char[] arr= str.toCharArray();
	for(int i=index;i<str.length();i++)
	{
			a=a+arr[i];
	}
	String newStr=new String(a);
	return newStr;
}
public static void main(String[] args)
{
	RemovecharInString scm=new RemovecharInString();
	String data=scm.mySubString("Hello World",4);
	System.out.println(data);

	}
	}
