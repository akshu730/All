
class Set2Program1
{
	public static void main(String[] args) 
	{
		int val=1;
		char c = 'a';
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==0||i==2||j==0||j==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();

		int k = 0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==0||(j==(3-k)&&j>0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			k++;
			System.out.println();
		}
	}	
}
