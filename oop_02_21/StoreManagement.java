package oop_interface_store;

public class StoreManagement {
	Store[] stores = new Store[5];
	
	StoreManagement() {
		for (int i = 0; i < stores.length; i++)
		{
			stores[i] = new Restaurant(i + "번째 레스토랑", Integer.toString(i), "02707"); 
			stores[i].changeOperationTime(9, 20);
			//StoreService.registerStore((StoreInterface)stores[i]);
			
			//TODO 메뉴 등록도 해야 
		}
	}
	
	//원래는 이렇게 쓰지 않아요. 아직 우리가 배운게 많지 않아서 배운 내에서 최대한 ^^ 
	StoreInterface[] getStores()
	{
		StoreInterface[] si = new StoreInterface[5];
		for (int i = 0; i < stores.length; i++)
		{
			si[i] = (StoreInterface)stores[i];
		}
		return si;
	}
	
	public static void main(String[] args) {
		StoreManagement sm = new StoreManagement();
		
		for (int i = 0; i < sm.stores.length; i++)
		{
			System.out.println(sm.stores[i].getName());
			System.out.println(sm.stores[i].getOperationTime(0)); //1048064
			System.out.println(sm.stores[i].isOperationTime(0, 8)); //False
			System.out.println(sm.stores[i].isOperationTime(0, 13)); //True
			System.out.println("");
		}
	}

}
