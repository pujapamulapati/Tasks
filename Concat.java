package Task1;

public class Concat 
{
	static int concat(int a, int b) 
    { 
        String s1 = Integer.toString(a); 
        String s2 = Integer.toString(b); 
          String s = s1 + s2; 
        int c = Integer.parseInt(s); 
        return c; 
    } 
  
    public static void main(String args[]) 
    { 
        int a = 12 ; 
        int b = 34; 
        System.out.println(concat(a, b)); 
    } 
} 