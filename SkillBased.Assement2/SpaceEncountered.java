package SkillBased;

public class SpaceEncountered {
	void myString(String str)
	{
		String[] Split = str.split(" ");
		for(int i=0;i<Split.length;i++)
		System.out.println(Split[i]);
	}
	public static void main(String[] args){
		SpaceEncountered string=new SpaceEncountered();
		string.myString("This Is Java Programming");
}
}
