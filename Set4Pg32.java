import java.util.Scanner;

class Set4Pg32
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=(i*2)-1;j++)
			{
				if(i%2==1)
				{
					if(j%2==1)
						System.out.print(0);
					else
						System.out.print(1);
				}
				else
				{
					if(j%2==0)
						System.out.print(0);
					else
						System.out.print(1);
				}
			}
			System.out.println();
		}

	}
}