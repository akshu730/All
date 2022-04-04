import java.util.Scanner;

class Set4Pg35
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	int mid = row/2+1;
	int k=1;

	for(int i=1;i<=row;i++)
	{
		int num = 0;
		char c = 64;
		if(i<mid)
		{
			c num++;
						System.out.print(num);
					}
					else
					{
						num--;
						System.out.print(num);
					}
				}
			}
		}
		else if(i>mid)
		{
			for(int j=1;j<=row;j++)
			{
				if(j<=k || j>row-k)
					System.out.print(" ");
				else
				{
					if(j<=mid)
					{
						c++;
						System.out.print(c);
					}
					else
					{
						c--;
						System.out.print(c);
					}	
				}
			}
			k++;
		}
		else
		{
			for(int j=1;j<=row;j++)
				System.out.print("*");
		}
		System.out.println();
	}	
	}
}