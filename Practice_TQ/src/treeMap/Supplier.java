package treeMap;



public class Supplier
{
	int sId;
	String sName;
	Supplier(){}
	Supplier(int sId,String sName)
	{
		this.sId = sId;
		this.sName = sName;
	}
	
	public String toString()
	{
		return sId+" "+sName;
	}

}