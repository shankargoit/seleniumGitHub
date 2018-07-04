package basic.java.code;

public class ArryPassedByRef 
{

	public static void passbyRef(String st[])
	{
		String str[]= {"Sapphire"};
		
	}
	
	public static void main(String[] args) 
	{
		String value[]= {"patch","release","bug"};
		
		System.out.println(value[0]);
		
		ArryPassedByRef.passbyRef(value);
		
		System.out.println(value[0]);

	}
}
