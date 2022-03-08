package oop_interface_store;

public class Product {
	String name;
	String description;
	int price; 
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	Product(String name, int price, String description){
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	//Question: description을 생성자 함수에서처리하지 않고 별도로 처리한 이유는?
	//Answer : description은 나중에 등록해도 댐(optional)
	void setDescription(String description)
	{
		this.description = description;
	}
}
