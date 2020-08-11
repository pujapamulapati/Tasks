package task6;

public class AscendingOrder {
public static void main(String[] args)
{
int [] arr = new int [] {50,25,89,79,11,99,44};     
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
}   