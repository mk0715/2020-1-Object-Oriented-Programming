package oop_interface_store;

public interface StoreInterface {
	String getName();
	boolean isOperationTime(int day, int hour);
	boolean isLocated(String zipCode);
	Product[] showProductList();
	boolean reserveVisiting(int day, int hour);
	//배달 메뉴의 총 가격 합을 리턴으로 
	int reserveDelivery(Product[] products);
	//테이크아웃 메뉴의 총 가격 합을 리턴으로 
	int reserveTakeout(Product[] products);
}
