package linkList.com;
import java.util.LinkedList;

// 1. WAP to append the specified element to the end of a linked list.


public class LinkedList_pra01 {
	
	public static void main(String[] args) {

		LinkedList<String> l_list = new LinkedList<String>();
		
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		l_list.add("Yellow");

		// print the list
		System.out.println("The linked list: " + l_list);
	}
}
