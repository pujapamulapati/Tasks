package Task3;

public class ReplaceLastChar 
{
	String myReplacelast(String str , char replace)
	{
		char[] arr=str.toCharArray();
		char find=str.charAt(str.length()-1);
		for(int i=0;i<str.length();i++)
		{
		if(i==(str.length()-1)) 
		{
		if(arr[i]==find)
		arr[i]=replace;
		}
		}
		String manStr=new String(arr);
		return manStr;
		}
	public static void main(String[] args) {

	ReplaceLastChar scm=new ReplaceLastChar();
	String data=scm.myReplacelast("testdata",'w');
	System.out.println(data);

	}

}
