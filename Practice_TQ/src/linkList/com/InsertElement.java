package linkList.com;
import java.util.LinkedList;

//Assignment :- Q.5) WAP to insert the specified element at the specified position in the linked list
//              Q.6) WAP to insert elements into the linked list at the first and last position.

public class InsertElement {
	
	public void addElements(LinkedList <Integer> l)
	{
		l.addFirst(1);         // Q.6
		l.addLast(88);
		System.out.println("\nUsing AddFirst And AddLast Method : "+l);
		
		l.add(2, 66);      //insert element in 2 index         Q.5
		System.out.println("\nAfter inserting element in 2 index LinkedList : "+l);
	}

	public static void main(String[] args) {
		LinkedList <Integer> l = new LinkedList <>();
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(44);
		l.add(55);
		
		System.out.println("Original Linked List :"+l);
		
		InsertElement obj = new InsertElement();
		obj.addElements(l);

	}

}