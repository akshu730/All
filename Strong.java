import java.util.Scanner;	

class Strong
{
	public static void checkStrong(int value)
	{
		int strong = value;
		int fact = 1;
		int sum = 0;
		while(value>0)
		{
			int temp = value%10;
			for(;temp>0;)
			{
				fact*=temp;
				temp--;
			}

			sum+=fact;
			fact = 1;
			value/=10;
		}
		if(sum==strong)
			System.out.println("Strong number");
		else
			System.out.println("Not a Strong number");
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		checkStrong(value);
	}
}