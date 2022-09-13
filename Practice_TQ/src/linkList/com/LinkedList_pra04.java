package linkList.com;
import java.util.LinkedList;
import java.util.Iterator;

// 3. WAP to iterate through all elements in a linked list starting at the specified position.


public class LinkedList_pra04 {

	public static void main(String[] args) {
		LinkedList<String> l_list = new LinkedList<String>();

		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");

		System.out.println("Original linked list:" + l_list);  

		Iterator it = l_list.descendingIterator();

		// Print list elements in reverse order
		
		System.out.println("Elements in Reverse Order :");
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
