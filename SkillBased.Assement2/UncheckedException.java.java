package SkillBased;
class InvalidException extends RuntimeException{  


	public InvalidException() {
	super("Invalid Marks");  
	 }  
	}  
class Marks {
	  void validate(int marks)throws InvalidException{  
		     if(marks>100)  
		      throw new InvalidException();  
		     else  if(marks>=0 && marks<=100)
		      System.out.println("Valid Marks");  
		   }  
public static class UncheckedException {
	public static void main(String[] args) {
		Marks b=new Marks();
		try{
		b.validate(6);
		b.validate(60);
		b.validate(90);
		b.validate(109);
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		System.out.println("End");
		}
}
}
