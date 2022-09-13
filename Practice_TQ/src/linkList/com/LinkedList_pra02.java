package linkList.com;
import java.util.Iterator;
import java.util.LinkedList;

// 2. WAP to iterate through all elements in a linked list.


public class LinkedList_pra02 {

	public static void iterateUsingIterator(LinkedList<Integer> linkedList){

		System.out.print("Iterating the LinkedList using Iterator : ");

		Iterator it = linkedList.iterator();

		while(it.hasNext()){

			System.out.print(it.next() + " ");
		}
		/* 
		 *  while(int i<linkedList.size()){
	            System.out.print(linkedList.get(i) + " ");
	            i++; }*/

		/* for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");  } */


	}

	public static void main(String[] args) {

		LinkedList_pra02 obj =new LinkedList_pra02();

		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		iterateUsingIterator(ll);
	}

}