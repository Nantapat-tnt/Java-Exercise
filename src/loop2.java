
public class loop2
{

	public static void main(String[] args)
	{
		int x;
		x = 1;
		while (x <= 100)
		{
			if(x%3 == 0 && x%5 == 0)
			{
				System.out.println(x);
			}
			x++;
		}

	}

}
