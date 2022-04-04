class Set2Program3
{
	public static void main(String[] args) 
	{
		int n = 28;
		int sum = 0;
		int i = 1;
		while(i<=n/2+1)
		{
			if(n%i==0)
			{
				sum+=i;
			}
			i++;
		}

		if(sum==n)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}
}