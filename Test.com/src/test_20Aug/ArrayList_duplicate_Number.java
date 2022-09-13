package test_20Aug;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayList_duplicate_Number {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		Scanner sc=new Scanner(System.in); 

		for (int i=0;i<10;i++)
		{
			al.add(sc.nextInt());
		}

		System.out.println("ArrayList with duplicates: " + al);

		List<Integer> newList = al.stream().distinct().collect(Collectors.toList());

		System.out.println("ArrayList with duplicates removed: "+ newList);
	}
}
