import java.util.Scanner;

class Set4Pg34
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int mid = row/2+1;
		int k=1;
		for(int i=1;i<=row;i++)
		{
			if(i<=mid)
			{
				for(int j=1;j<=row;j++)
				{
					if(j<=mid-i || j>=mid+i)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(j%2);
					}	
				}
			}
			else
			{
				for(int j=1;j<=row;j++)
				{
					if(j<=k || j>row-k)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(j%2);
					}
				}
				k++;
			}
			System.out.println();
		}
	}
}