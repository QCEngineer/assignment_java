package linkList.com;

public class LinkedList_Practic01 {

	Node head; 
	
	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
		}
	}
	public static LinkedList_Practic01 insert(LinkedList_Practic01 list, int data)
	{
		Node new_node = new Node(data);
		
		if (list.head == null) {
			list.head = new_node;
		}
		else 
		{
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}

		return list;
	}

	public static void printList(LinkedList_Practic01 list)
	{
		Node currNode = list.head;
	
		System.out.print("LinkedList: ");
	
		while (currNode != null) {
			System.out.print(currNode.data + " ");
	
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args){
		
		
		LinkedList_Practic01 list = new LinkedList_Practic01();

		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

		printList(list);
	}
}
