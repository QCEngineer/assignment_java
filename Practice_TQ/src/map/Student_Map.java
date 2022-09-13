package map;


// Class Example

public class Student_Map
{
	int roll;
	String name;
	public Student_Map() {}
	public Student_Map(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	/*public int hashCode() {
		final int result;
		result = name.hashCode()%(roll%7) ;
		return result;
		}*/
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student_Map other = (Student_Map) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}
}
