package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Example_HashMap  {

	public static void main(String args[]) {

		Map<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("arvind", 111111111);
		hm.put("ajay", 222222222);
		hm.put("vijay", 333333333);

		Set<Map.Entry<String, Integer>> hmSet= hm.entrySet();

		System.out.println("-------------------------------------------------------------------");
		for (Map.Entry<String, Integer> phEntry : hmSet) {
			System.out.println("Name : " + phEntry.getKey() + " " + " Number : " + phEntry.getValue());
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.println("No of contacts in Phone : " + hm.size());
		System.out.println("Arvind Contact number : " + hm.get("arvind"));
		System.out.println("Delete ajay contact : " + hm.remove("ajay"));
	}
}