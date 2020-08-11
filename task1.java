package Task5;


public class task1 
{
	int s=0;
	int p=0;
	int j=0;
	int odd,even,q;
	int sum(int... x)
	{
	for (int i: x) 
	{
		s+=i;
	}
	System.out.println(s);
	for (int i: x) 
	{
		if(i>p)
		p=i;
	}
	System.out.println(p);
	for (int i: x) 
	{
	   if(j>0)
	   {
	   if(i<j)
		j=i;
	   }
	   else
		   j=i;
	}
	System.out.println(j);
	
	for (int i: x) 
	{
	if(i%2==0)
	even++;
	else 
	odd++;
	}
	System.out.println("Even Count= " +even);
	System.out.println("Odd Count= " +odd);
	
	for (int i: x) 
	{
	 if(i%3==0)
	q++;
	}
	System.out.println("Multiple of 3 Count= " +q );
	return 0;
	}
	public static void main(String[] args)
	{
		task1 c=new task1();
		c.sum(10,1,4,3,5,9);
		}
}
