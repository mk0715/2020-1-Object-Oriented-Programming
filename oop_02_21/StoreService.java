package oop_interface_store;

public class StoreService {
	/*
	static StoreInterface[] sis = new StoreInterface[100];
	static int siCount = 0;
	
	public static void registerStore(StoreInterface si)
	{
		sis[siCount] = si;
		siCount++;
	}
	*/
	
	public static void main(String[] args) {
		StoreManagement sm = new StoreManagement(); 
		StoreInterface[] sis = sm.getStores();
		
		for (int i = 0; i < sis.length; i++)
		{
			System.out.println(sis[i].getName());
			//System.out.println(si[i].getOperationTime(0)); //1048064
			System.out.println(sis[i].isOperationTime(0, 8)); //False
			System.out.println(sis[i].isOperationTime(0, 13)); //True
			System.out.println("");
		}
	}
}
