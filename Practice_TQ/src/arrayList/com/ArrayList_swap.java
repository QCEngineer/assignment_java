package arrayList.com;
import java.util.ArrayList;
import java.util.Collections;

// 22. WAP of swap two elements in an ArrayList


public class ArrayList_swap {
	
	ArrayList<String> str = new ArrayList<String>();

	str.add("Item 1");
	str.add("Item 2");
	str.add("Item 3");
	str.add("Item 4");
	str.add("Item 5");

	
	public static void main(String a[]) {
		// TODO Auto-generated method stub

		ArrayList_swap obj =new ArrayList_swap ();

		System.out.println("Before Swap the ArrayList ");
		System.out.println(obj);

		Collections.swap( ArrList, 1, 2);

		System.out.println("After Swap the ArrayList");
		System.out.println(obj);
	}
}
