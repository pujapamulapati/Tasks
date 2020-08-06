package Task2;

public class ReverseNumber {
	public static void main(String [] args)
	{
		int num=1234,Number=0;
		while(num > 0)
		{
			int n=num%10;
			num=num/10;
			Number=Number*10+n;
		}
		System.out.println(Number);
	}
	}
