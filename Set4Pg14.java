import java.util.Scanner;

class Set4Pg14
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i==j||i==row||j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}	
	}
}