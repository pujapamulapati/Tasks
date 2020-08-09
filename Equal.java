package Task3;


public class Equal 
{
boolean checkEqual(char c1, char c2) 
{
if(Character.toLowerCase(c1)==Character.toLowerCase(c2))
return true;
else if(c1==(c2+32) || c1==(c2-32))
return true;
else 
return false; 
}
	
public static void main(String[] args) {
	Equal scm=new Equal();
	boolean data=scm.checkEqual('P','p');	
	System.out.println(data);
	Equal sc=new Equal();
	boolean data1=sc.checkEqual('P','o');	
	System.out.println(data1);
	}
}


