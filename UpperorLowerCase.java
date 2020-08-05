package Task1;

public class UpperorLowerCase {
	public static void main(String [] args)
    {  
      char ch='P'; 
      if (ch >= 'A' && ch <= 'Z')  
            System.out.println(ch + " Is an UpperCase character");  
      
      else if (ch >= 'a' && ch <= 'z')  
            System.out.println(ch + " Is an LowerCase character" );  
      
        else
            System.out.println(ch + "Is not an aplhabetic character");  
    }  

}
