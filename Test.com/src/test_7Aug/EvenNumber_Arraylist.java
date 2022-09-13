package test_7Aug;
import java.util.ArrayList;
import java.util.Scanner;


public class EvenNumber_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		{
			for(int i=0; i<4; i++) {

				list.add(sc.nextInt());
			} 
			int count=0;


			for(int i=0; i<=list.size(); i++) 
			{

				if (list.get(i) %2==0)
				{
					count++;
				}
			}
			System.out.println(count);

		}
		sc.close();
	}
}