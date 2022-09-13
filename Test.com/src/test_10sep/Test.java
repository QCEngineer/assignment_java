package test_10sep;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;


public class Test{

	public static void main(String args[])    {

		ArrayList<Integer> al= new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			al.add(sc.nextInt());
		}

		LinkedHashSet <Integer> hs =new LinkedHashSet<>(al);
		ArrayList<Integer> al1=new ArrayList<>(hs);
		Iterator<Integer> itr =al1.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			System.out.print(i+" ");
		} 
		sc.close();

	}

}