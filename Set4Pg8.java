import java.util.Scanner;

class Set4Pg8
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i==2&&j==2)
					System.out.print("@");
				else if(i==row&&j==row-1)
					System.out.print("!");
				else
					System.out.print("*");
			}
			System.out.println();
		}	
	}
}