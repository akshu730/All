import java.util.Scanner;

class Fibonacci
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			printFibonacci(n);
	}

	public static void printFibonacci(int count)
	{
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1+" "+n2);
		for(int i=3;i<=count;i++)
		{
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
}