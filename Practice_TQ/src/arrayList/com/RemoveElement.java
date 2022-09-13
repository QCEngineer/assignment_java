package arrayList.com;
import java.util.ArrayList;

//8. WAP to remove element from ArrayList


public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("White");
		colors.add("Black");
		colors.add("Green");
		System.out.println("ArrayList: " + colors); 	
		System.out.println("ArrayList after remove element : ");
		colors.remove(0);
		colors.remove("Black");
		System.out.println("ArrayList: " + colors); 
	}

}