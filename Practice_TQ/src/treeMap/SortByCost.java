package treeMap;


import java.util.Comparator;

public class SortByCost implements Comparator<Item>
{

	public int compare(Item i1,Item i2)
	{
		if(i1.iCost<i2.iCost)
			return 1;
		else if(i1.iCost>i2.iCost)
			return -1;
		else {
			if(i1.iName.compareTo(i2.iName)<0)
				return 1;
			else if(i1.iName.compareTo(i2.iName)>0)
				return -1;
			else
				return 0;
		}
	}		
		
	}

	