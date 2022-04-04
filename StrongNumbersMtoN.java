import java.util.Scanner;

class StrongNumbersMtoN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		printStrongNumbers(m,n);	
	}

	public static void printStrongNumbers(int m,int n)
	{
		
		for(int i=m;i<=n;i++)
		{
			int sum = 0;
			int value = i;
			while(value>0)
			{
				int temp = value%10;
				int fact = 1;
				for(;temp>0;temp--)
				{
					fact = fact*temp;
				}
				sum+=fact;
				value/=10;
			}
			if(sum==i)
				System.out.print(i+" ");
		}
	}
}