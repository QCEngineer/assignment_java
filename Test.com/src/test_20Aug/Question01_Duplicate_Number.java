package test_20Aug;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;


// Input :- 1 2 3 1 2 3 4 5 4 5

// output :- 1 2 3 4 5

public class Question01_Duplicate_Number {

	public static void main(String [] args ) {

		ArrayList<Integer> al= new ArrayList<>();
		Scanner sc=new Scanner (System.in);

		for(int i=0;i<10;i++)
		{
			al.add(sc.nextInt());
		}

		LinkedHashSet<Integer> hs=new LinkedHashSet<>(al);

		ArrayList<Integer> al1= new ArrayList<>(hs);

		Iterator<Integer>itr =al1.iterator();
		while (itr.hasNext())
		{
			Integer i=itr.next();
			System.out.print(i+" ");
		}

		sc.close();
	}
}
