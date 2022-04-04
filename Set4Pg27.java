package Set4;

import java.util.Scanner;

public class Set4Pg27 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			int num = 1;
			char c = 'a';
			for(int j=1;j<=i;j++)
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
