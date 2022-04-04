class Set2Program5
{
	public static void main(String[] args) 
	{
		int n = 4;
		int i = 1;
		int fact = 1;
		while(i<=n)
		{
			fact*=i;
			i++;
		}
		System.out.println(fact);
	}
}