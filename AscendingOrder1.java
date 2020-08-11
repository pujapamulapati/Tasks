package Task5;

public class AscendingOrder1 
{
public void myArray(int... arr)
{
	int t= 0;      
	for (int i = 0; i < arr.length; i++)
	{     
	    for (int j = i+1; j < arr.length; j++) 
	    {     
	       if(arr[i] > arr[j])
	       {    
	           t= arr[i];    
	           arr[i] = arr[j];    
	           arr[j] = t;    
	       }     
	    }     
	}    
	System.out.println("Ascending order: ");    
	for (int i = 0; i < arr.length; i++)
	{     
	System.out.print(arr[i] + " ");    
	}    
	}   
public static void main(String[] args)
{
	AscendingOrder1 data=new AscendingOrder1();
	data.myArray(50,25,89,79,11,99,44);
}
}
