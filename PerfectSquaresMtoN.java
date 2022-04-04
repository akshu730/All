import java.util.Scanner;

class PerfectSquaresMtoN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		for(int i = m;i<=n;i++)
		{
			for (int j=1;j<=i/2+1;j++) 
			{
				if(j*j==i)
				{
					System.out.print(i+" ");
					break;
				}
			}
		}	
	}
}