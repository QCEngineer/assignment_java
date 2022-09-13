package treeMap;

import java.util.Collections;
import java.util.TreeMap;

public class ItemDetails 
{
    TreeMap <Item,Supplier> tp;
	
    ItemDetails()
	{
		tp = new TreeMap<>(new SortByCost());
	}
     
    public void createMap()
    {
    	tp.put(new Item(1,"AC", 10000) ,new Supplier(101,"aaaa"));
    	tp.put(new Item(2,"Phone", 20000) ,new Supplier(102,"bbbb"));
    	
    	//tp.put(new Item(2,"Phone", 20000) ,new Supplier(100,"bbbb"));  return
    	
    	tp.put(new Item(3,"Tv", 15000) ,new Supplier(103,"cccc"));
    	tp.put(new Item(4,"Watch", 15000) ,new Supplier(103,"cccc"));

    	
    	System.out.println(tp);
    }
        
	public static void main(String[] args) 
	{
		ItemDetails obj = new ItemDetails();
		obj.createMap();
}
    }