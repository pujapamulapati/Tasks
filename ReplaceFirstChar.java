package Task3;

public class ReplaceFirstChar 
{
	String myReplacefirst(String str , char replace)
	{
		char[] arr=str.toCharArray();
		char find=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
		if(i==0) 
		{
		if(arr[i]==find)
		arr[i]=replace;
		}
		}
		String manStr=new String(arr);
		return manStr;
		}
	public static void main(String[] args) {

	ReplaceFirstChar scm=new ReplaceFirstChar();
	String data=scm.myReplacefirst("testdata",'w');
	System.out.println(data);

	}

	}
