package Task2;

public class TailZeros {
public static void main(String [] args) {
int count = 0, num = 10101,n;
do
{
	 n=num%10;
	 if(n==0)
	 {
	 count++;
	 }
	num=num/10;
}while(n==0);
	System.out.println("Number of Zero digits: " + count);
}
}
