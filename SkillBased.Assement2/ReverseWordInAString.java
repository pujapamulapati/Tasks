package SkillBased;


public class ReverseWordInAString {
void myString(String str)
{
	 String[] String = str.split(" ");
    String reversestring = "";  
   for(int i=0;i<String.length; i++) 
   {
       String word = String[i];
       String reverse = "";
       for(int j=word.length()-1;j>=0;j--) 
       {
           reverse=reverse+word.charAt(j);
       }
       reversestring=reversestring+reverse+" ";
   }   
   System.out.println(reversestring);
}
public static void main(String[] args){
	 ReverseWordInAString string=new ReverseWordInAString();
	string.myString("This Is Java Programming");
}
}