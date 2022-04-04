import java.util.Scanner;

class Set4Pg20
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char c = 'a';
		int num = 1;
		int row = sc.nextInt();
		int col = sc.nextInt();

		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i%2==1)
				{
					System.out.print(num);
					num++;
				}
				else
				{
					System.out.print(c);
					c++;
				}
			}
			System.out.println();
		}	
	}
}