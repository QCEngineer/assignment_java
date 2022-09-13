package extraAssignments.com;
import java.util.Scanner;

public class PrimeNumbers2_Series{

	public static void main (String[] args){
		
		
		
		Scanner scanner = new Scanner(System.in);

		String primeNumbers = "";
		System.out.println("Enter Number:");
		int n = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= n; i++)
		{
			int counter=0;
			for(int j =i; j>=1; j--)
			{
				if(i % j==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers between 1 and n are : ");
		System.out.println(primeNumbers);
	}
}