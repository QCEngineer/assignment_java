package extraAssignments.com;
import java.util.Scanner;

// User can enter max 5 numbers. check if each number is palindrome 

public class PalindromeNumber {
	int no,sum=0,temp,i;
	
	public void pNumbar() {

	
	for(i=no;i>0;)
	{
		temp=i%10;
		sum=sum*10+temp;
		i=i/10;	
	}
	if(sum==no)
	{
		System.out.println("Given is palindrome");
	}
	else
	{
		System.out.println("Given is not palindrome");
	}
	}
	
	

	public static void main(String[] args) {
		
		PalindromeNumber obj =new PalindromeNumber();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int p=sc.nextInt();
		
		obj.pNumbar();
		sc.close();
		

	}
}


