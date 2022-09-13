package treeMap;


public class Item 
{
	int id;String iName;float iCost;
	Item(){}
	Item(int id,String iName,float iCost)
	{
		this.id = id;
		this.iName = iName;
		this.iCost = iCost;
	}
	
	public String toString()
	{
		return id+" "+iName+" "+iCost;
	}
	
}