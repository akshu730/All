import java.util.Scanner;

class PrimeNumbersMtoN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int count = 0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.print(i+" ");
		}	
	}
}