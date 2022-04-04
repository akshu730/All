import java.util.Scanner;

class PalindromeMtoN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		printPalindromeNumbers(m,n);	
	}

	public static void printPalindromeNumbers(int m,int n)
	{
		for(int i = m;i<=n;i++)
		{
			int value = i;
			int rev = 0;
			while(value>0)
			{
				int temp = value%10;
				rev = (rev*10) + temp;
				value/=10;
			}
			if(rev==i)
				System.out.print(i+" ");
		}
	}

}