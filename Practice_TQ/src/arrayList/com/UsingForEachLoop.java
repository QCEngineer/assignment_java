package arrayList.com;
import java.util.ArrayList;
import java.util.ListIterator;

//6. WAP to iterate through all elements in an ArrayList using for each

public class UsingForEachLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("Python");
		System.out.println("ArrayList: " + languages);    


		ListIterator<String> iterate = languages.listIterator();
		System.out.println("Iterating over ArrayList:");

		for(String element : languages)
		{
			System.out.print(element + ", ");
		}
	}

}