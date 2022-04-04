class Set2Program4
{
	public static void main(String[] args) 
	{
		int n = 29;
		int i=1;
		int temp = n%10;
		boolean flag = false;
		if(temp==2||temp==3||temp==7||temp==9)
		{
			flag = false;
		}
		else
		{
			while(i<=n/2+1)
			{
				if(i*i==n)
				{
					flag=true;
					break;
				}
				i++;
			}
		}

		if(flag)
			System.out.println("Perfect square");
		else
			System.out.println("Not perfect square");
		
	}

}