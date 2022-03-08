package oop_02_11;

import java.util.Scanner;

public class Book {
	String title = "";
	String author = "";
	/*
	public Book(String title) {
		this(title,"작자미상");
	}
	*/
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Book[] books = new Book[5];
		
		String title;
		String author;
		
		for (int i=0; i<books.length; i++) {
			System.out.println("제목을 입력해주세요.");
			title = scanner.next();
			System.out.println("저자를 입력해주세요.(저자를 모를경우 작자미상이라고 적어주세요.)");
			author = scanner.next();
			books[i] = new Book(title, author);
		}
		
		for (int i=0; i<books.length; i++) {
			System.out.println(books[i].title + ": " + books[i].author);
		}
		
		
		
		scanner.close();
	}

}
