package extraAssignments.com;
import java.util.Scanner;

// 1,3,7,15,31,63,127 generate first n numbers of above series.

public class Print_SeriesExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pr=0;
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter the range of number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			pr=(pr*2)+1;
			System.out.print(pr+" ");
		}
		sc.close();
	}
}