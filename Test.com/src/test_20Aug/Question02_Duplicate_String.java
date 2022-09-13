package test_20Aug;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

// Input :- Good bye bye world world

// output :- bye world

public class Question02_Duplicate_String{                // incomplete

	public static void main(String [] args ) {

		ArrayList<String> al= new ArrayList<>();
		Scanner sc=new Scanner (System.in);

		for(int i=0;i<10;i++)
		{
			al.add(sc.next());
		}

		LinkedHashSet<String> hs=new LinkedHashSet<>(al);

		ArrayList<String> al1= new ArrayList<>(hs);

		Iterator<String>itr =al1.iterator();
		while (itr.hasNext())
		{
			String i=itr.next();
			System.out.print(i+" ");
		}

		sc.close();
	}
}

