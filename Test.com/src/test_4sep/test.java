package test_4sep;

import java.util.Scanner;
import java.util.ArrayList;

public class test
{

	public static void main(String[] args)
	{

		ArrayList<Integer> al = new ArrayList<>();

		Scanner sc = new Scanner (System.in);

		for(int i=0;i<10;i++)
		{
			al.add(sc.nextInt());
		}	
		for (int i = 0; i < 10; i++) 
		{  // For odd numbers
			
		    if (sc[i] % 2 != 0)
		    {
		        i = al;
		    }
		    System.out.println(al);
		}
		
	}
}
//import java.util.*;
//class OddElement {
//   public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       System.out.println("Enter the size of list");
//       int n= sc.nextInt();
//       List<Integer> arr= new ArrayList<>();
//       for(int i=0;i<n;i++){
//           arr.add(sc.nextInt());
//       }
//
//       if(isListOdd(arr)) {
//           System.out.println("List contains only odd elements");
//       }
//       else{
//           System.out.println("list doesn't contains only odd elements");
//       }
//   }
//   static boolean isListOdd(List<Integer> arr)
//   {
//       for(int i:arr){
//           if(i%2==0)
//               return false;
//       }
//       return true;
//   }
//}