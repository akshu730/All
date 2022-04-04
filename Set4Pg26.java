package Set4;

import java.util.Scanner;

public class Set4Pg26 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		char c1 = 'a';
		
		for(int i=1;i<=row;i++)
		{
			char c2 = c1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c2);
				c2++;
			}
			c1++;
			System.out.println();
		}

	}

}
