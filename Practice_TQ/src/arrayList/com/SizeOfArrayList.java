package arrayList.com;

import java.util.ArrayList;

//11. WAP to know how many elements in ArrayList

public class SizeOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);
		arrlist.add(6);
		arrlist.add(7);
		arrlist.add(8);
		arrlist.add(9);
		arrlist.add(10);
		arrlist.add(11);
		arrlist.add(12);
		arrlist.add(13);
		arrlist.add(14);
		arrlist.add(15);



		int size = arrlist.size();
		System.out.println("Size of list = "+ size);
	}

}