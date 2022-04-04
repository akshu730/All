import java.util.Scanner;

class Set4Pg21 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int num = 1;
		char c = 'A';
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i==j)
				{
					System.out.print(c);
					c++;
				}
				else if(i==1 || i==row || j==1 || j==row)
				{
					System.out.print(num);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
