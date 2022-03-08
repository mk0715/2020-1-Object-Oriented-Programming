package oop_interface_store;

//Question: abstract이여야 할까?
public abstract class Store {
	String name; 
	String registerNumber; 
	String zipcode;

	int[] operationTime = new int[7];
	//나중에 ArrayList로 리팩토링할 대
	Product[] products = new Product[10];
	int productCount = 0; 
	
	Store(String name, String registerNumber, String zipcode)
	{
		this.name = name; 
		this.registerNumber = registerNumber;
		this.zipcode = zipcode;	
	}
	
	//생각할거리: startHour과 endHour만 주어진다면 시간을 어떻게 넘겨줘야 할까요? 
	//day가 int 라면 어떻게 받겠다는 걸까요? 
	//일단은 누군가 잘 알고 넘겨준다는 전제로 코딩되어 있습니다. 
	void changeOperationTime(int day, int startHour, int endHour)
	{
		int time = 0 ;
		
		// startHour = 9, endHour = 18
		// 00000000 00001111 11111110 00000000
		// .................1
		for (int i = startHour; i < endHour; i++)
		{
			time = time | (1 << i);
		}
		
		operationTime[day] = time; 
	}
	
	void changeOperationTime(int startHour, int endHour)
	{
		for (int i = 0; i < 7; i++) {
			changeOperationTime(i, startHour, endHour);
		}
	}
	
	void addProducts(Product p)
	{
		products[productCount] = p;
		productCount++;
	}
	
	public boolean isOperationTime(int day, int visitingHour)
	{
		int time = 0; 
		time = time | (1 << visitingHour);
		
		return (operationTime[day] & time) > 0;
	}
	
	int getOperationTime(int day)
	{
		return operationTime[day];
	}
	
	public boolean isLocated(String zipcode)
	{
		return this.zipcode.equals(zipcode);
	}
	
	public Product[] showProductList() {
		return products;
	}
	
	public String getName() {
		return name;
	}
	
}
