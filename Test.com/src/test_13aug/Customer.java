package test_13aug;

public class Customer {
	int cid,cAge,noOfSeat;
	String cName;

	Customer (){}

	Customer (String n ,int cid ,int cAge,int s){

		this.noOfSeat=s;
		this.cAge=cAge;
		this.cid=cid;
		this.cName=n;
	}
	public String toString() {
		
		return cName+" , " +cid+" , "+cAge+" , "+noOfSeat;
	}
}

