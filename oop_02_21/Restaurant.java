package oop_interface_store;

public class Restaurant extends Store implements StoreInterface{
	
	Restaurant(String name, String registerNumber, String zipcode) {
		super(name, registerNumber, zipcode);
	}

	int reservationType;
	int fee;
	int type;

	//TODO 예약의 상세는 구현하지 않겠지만, 아이디어는 공유해봅시다! 
	//구현해볼까요? 흠... 
	@Override
	public boolean reserveVisiting(int day, int hour) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int reserveDelivery(Product[] products) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int reserveTakeout(Product[] products) {
		// TODO Auto-generated method stub
		return 0;
	}
}
