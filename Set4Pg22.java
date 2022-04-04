import java.util.Scanner;

class Set4Pg22 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int num = 1;
		char c = 'a';
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(j%2==1)
				{
					if(num>9)
					{
						num = 1;
						System.out.print(num);
						num+=2;
					}
					else
					{
						System.out.print(num);
						num+=2;
					}
				}
				else
				{
					
					System.out.print(c);
					c++;
				}
			}
			if(num>9)
				num = 1;
			
			System.out.println();
		}
		
	}

}
