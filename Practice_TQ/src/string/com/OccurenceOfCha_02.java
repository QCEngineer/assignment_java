package string.com;
import java.util.HashMap;

public class OccurenceOfCha_02 {

	public static void main(String[] args ) {

		String str = "Google";

		HashMap <Character, Integer> hm = new HashMap<>();

		for (int i=0;i < str.length(); i++) 
		{
			if (hm.containsKey(str.charAt(i)))
			{
				Integer cr =hm.getOrDefault(str.charAt(i),0);
				hm.put(str.charAt(i), cr+1);
			}
		
		}
		System.out.println(hm);
	}
}