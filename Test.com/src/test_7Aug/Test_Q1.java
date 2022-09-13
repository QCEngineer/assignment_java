package test_7Aug;

import java.util.ArrayList;
import java.util.Collections;         
import java.util.Comparator;
import java.util.Scanner;           

class SortByLength implements Comparator <String> {       //Test_Q2


		public int compare (String o1,String o2)
		{
			return o1.length() -o2.length();
			
		}
		
	}
	public class Test_Q1 {
		
		public ArrayList<String> arrangewords (ArrayList <String> al)
		{
			
			Collections.sort(al,new SortByLength());
			
			return al;
		}

		public ArrayList<String> prepareList (String s) 
		{
			Scanner sc = new Scanner (System.in);
			
			ArrayList<String> list =new ArrayList <String> ();
			
			String [] word = s.split(" ");
			
			for (String val : word) {
				if (val !=" ") 
				{
					list.add(val);
				}
			}
			
		list = arrangewords(list);
		return list;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test_Q1 obj = new Test_Q1();
		
		Scanner sc = new Scanner (System.in);
		String str =sc.nextLine();
		
		ArrayList<String> list1 =new ArrayList <String>(); 
		list1=obj.prepareList(str);
		
		for (int i=0;i<list1.size();i++);
				{
					System.out.println(list1.get(0)+" ");
				}

	}
}
