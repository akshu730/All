package Set4;

import java.util.Scanner;

public class Set4Pg23 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int num = 1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(num>9)
				{
					num = 1;
					System.out.print(num);
					num++;
				}
				else
				{
					System.out.print(num);
					num++;
				}
			}
			System.out.println();
		}

	}

}
