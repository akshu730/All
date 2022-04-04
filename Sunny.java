import java.util.Scanner;

class Sunny
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		checkSunny(num);
	}

	public static void checkSunny(int num)
	{
		boolean flag = false;
		for(int i=1;i<=num/2;i++)
		{
			if(i*i==(num+1))
			{
				flag = true;
				break;
			}
		} 
		if(flag)
			System.out.println("Sunny number");
		else
			System.out.println("Not a sunny number");
	}
}