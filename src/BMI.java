import java.util.Scanner;

public class BMI
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Double weight, height, BMI;
		System.out.println("Please input your height(cm) :");
		height = sc.nextDouble();
		System.out.println("Please input your weight(kg) :");
		weight = sc.nextDouble();
		height = height / 100;
		BMI = weight / (height * height);
		if (BMI < 20)
		{
			System.out.println("ผอม");
		} else
		{
			if (BMI > 25)
			{
				System.out.println("อ้วน");

			} else
			{
				System.out.println("ปกติ");
			}
		}
		sc.close();

	}

}
