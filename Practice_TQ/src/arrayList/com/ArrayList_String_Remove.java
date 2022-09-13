package arrayList.com;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList_String_Remove {

	public void checkLEength (ArrayList<String> o)
	{
		Iterator <String> itr=o.iterator();
		while (itr.hasNext())
		{
			String str =itr.next();
			int size=str.length(); 
			if (size>5)
			{
				itr.remove();
			}
		}
		System.out.println(o);


	}
	public static void main (String [] args) {

		ArrayList_String_Remove obj=new ArrayList_String_Remove();

		ArrayList<String> o = new ArrayList<> ();

		System.out.println(o);

		System.out.println(o.size());

		o.add("heyy");
		o.add("Good");
		o.add("Morning");

		System.out.println(o);

		obj.checkLEength(o);

	}
}