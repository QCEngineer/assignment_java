package map;


import java.util.HashMap;

public class HashCodeOfKey {

	// class Example
	
	public static void main(String[] args)
	{
		HashMap<Student_Map,String> m = new HashMap<>();
		
		
		Student_Map s1 = new Student_Map(10, "ram");
		Student_Map s2 = new Student_Map(20, "shyam");
		Student_Map s3 = new Student_Map(30, "seema");
		Student_Map s4 = new Student_Map(40, "vijay");
		Student_Map s5 = new Student_Map(50, "vishal");
		
		System.out.println("HashCode of s1 " + s1.hashCode());
		System.out.println("HashCode of s2 " + s2.hashCode());
		System.out.println("HashCode of s3 " + s3.hashCode());
		System.out.println("HashCode of s4 " + s4.hashCode());
		System.out.println("HashCode of s5 " + s5.hashCode());
		
		m.put(s1, "Batch1");
		m.put(s2, "Batch2");
		m.put(s3, "Batch1");
		m.put(s4, "Batch2");
		m.put(s5, "Batch2");

		
		System.out.println("after Hash() on s1: " +(s1.hashCode() ^ (s1.hashCode()>>>16)));
	}

}
