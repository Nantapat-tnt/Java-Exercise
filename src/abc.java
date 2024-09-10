import java.util.Scanner;

public class abc
{

	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a,b,c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a > 3)
		{
			System.out.println("RED");	
		}
		else
		{
			if(b <=2)
			{
				if(c != 5)
				{
					System.out.println("GREEN");
				}
				else
			{
				System.out.println("BLUE");
			}
			}
			else
			{
				System.out.println("PINK");
			}
		}
	}
}
		
