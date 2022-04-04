import java.util.Scanner;

class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		checkLeapYear(num);	
	}

	public static void checkLeapYear(int num)
	{
		if(num%4==0 &&((num%400==0) || (num%100!=0)))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}

		
	}
}