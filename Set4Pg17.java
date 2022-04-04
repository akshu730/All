import java.util.Scanner;

class Set4Pg17
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		int mid = col/2 +1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(j<=mid-i || j>=mid+i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}	
	}
}