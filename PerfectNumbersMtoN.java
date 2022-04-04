import java.util.Scanner;

class PerfectNumbersMtoN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		printPerfectNumbers(m,n);	
	}

	public static void printPerfectNumbers(int m,int n)
	{
		for(int i=m;i<=n;i++)
		{
			int sum = 0;
			for(int j=1;j<=i/2;j++)
			{
				
				if(i%j==0)
				{
					sum = sum + j;
				}

			}
			if(sum==i)
				System.out.print(i+" ");
		}
	}
}