package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 3. Explain how put() method of HashMap works internally with example.

// 4. Explain how get() method of HashMap works internally with example.
public class HashMapExample1 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> m = new HashMap<>();
	
		
		m.put(23,"ram");
		m.put(55,"Kishore");
		m.put(89,"vijay");
		m.put(23, "shyam");
		m.put(100,null);	
		m.put(23, "aaaa");
		m.put(23, "bbbbb");
		m.put(23, "cccc");
		m.put(23, "dddd");
		m.put(23, "ffff");
		m.put(23, "gggggg");
		m.put(23, "hhhh");
		m.put(23, "iiii");
		m.put(23, "jjjj");
		m.put(23, "kkkk");
		m.put(23, "llll");
		m.put(23, "mmmm");
		m.put(23, "nnnnn");
		m.put(23, "oooo");
		m.put(23, "pppp");
		m.put(23, "qqqq");

		
		System.out.println(m);
		
		System.out.println("Value of key 55 : " + m.get(55));
		System.out.println("Value of key 23 : " + m.get(23));
		}
}
