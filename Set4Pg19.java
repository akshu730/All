import java.util.Scanner;

class Set4Pg19
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = 'A';
		int num = 1;
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i%2==1)
					System.out.print(ch);
				else
					System.out.print(num);
			}
			System.out.println();
			if(i%2==1)
				ch++;
			else
				num++;
		}	
	}
}