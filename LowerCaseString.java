package task8;

public class LowerCaseString {
	String myString(String str)
	{
		int b;
		char[] arr= str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				b=arr[i];
				b=b+32;
				arr[i]=(char) b;
			}
		}
		String newStr=new String(arr);
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LowerCaseString scm=new LowerCaseString();
         String data=scm.myString("Hello World");
 		System.out.println(data);
	}

}