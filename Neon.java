import java.util.Scanner;

class Neon
{
	public static void checkNeon(int value)
	{
		int sum = 0;
		int square = value*value;
		while(square>0)
		{
			int temp = square%10;
			sum+=temp;
			square/=10;
		}
		if(sum==value)
			System.out.println("Neon number");
		else
			System.out.println("Not a neon number");
	}

	public static void main(String[] akshay)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int value = sc.nextInt();
		checkNeon(value);
	}
}