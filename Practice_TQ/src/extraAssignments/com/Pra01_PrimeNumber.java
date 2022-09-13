package extraAssignments.com;
import java.util.Scanner;

public class Pra01_PrimeNumber {

	public static void main(String args[])
	{		
		int temp;
		boolean primeNo=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");

		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				primeNo=false;
				break;
			}
		}
		if(primeNo)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");

		sc.close();

	}

}
