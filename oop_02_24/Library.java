package oop_02_24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Library {
	//private Book[] books;
	private ArrayList<Book> books = new ArrayList<Book> ();
	private HashMap<String, ArrayList<Book>> bookmap = new HashMap<String, ArrayList<Book>> ();
	//private HashMap<String, Book> bookmap = new HashMap<String, Book> ();
		
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Library lib = new Library();		
		
		while(true) {
			System.out.println("이용할 메뉴를 선택하세요. ");
			System.out.println("1. 등록 ");
			System.out.println("2. 검색 ");
			System.out.println("3. 종료 ");
			
			switch (scanner.nextInt())  {
			case 1:{
				lib.registeBook("1111", "자바", "윤성혜");
				lib.registeBook("2222", "객체", "윤성혜");
				lib.registeBook("3333", "자바와 객체", "국민");
				break;
			}
			case 2:{
				lib.searchBook();
				break;
			}
			case 3:{
				scanner.close();
				return;
			}
			default:{
				System.out.println("선택한 메뉴가 없습니다.");
			}
			
		}
		}		
		
	}
	
	private void registeBook(String ISBN, String title, String author) {
		/*
		System.out.println("책의 ISBN을 입력해주세요.");
		String ISBN = scanner.next();
		System.out.println("책의 제목을 입력해주세요.");
		String title = scanner.next();
		System.out.println("책의 저자를 입력해주세요.");
		String author = scanner.next();
		*/
		Book book = new Book(ISBN, title, author);
		books.add(book);
		ArrayList<Book> abooks = bookmap.get(author);
		if (abooks == null) {
			abooks = new ArrayList<Book>();
		}
		abooks.add(book);
		bookmap.put(author, abooks);
		
		System.out.println("책의 총 권수는 " + books.size() + "입니다.");
		//TODO: Collection으로 후정 후 바뀌어야 하는 로직
		//System.out.println("책의 총 권수는 " + Book.getCount() + "입니다.");
		
		for (int i=0; i<books.size();i++) {
			System.out.println(books.get(i).toString());
		}
	}
	
	private void searchBook() {
		System.out.println("검색 대상을 선택하세요. ");
		System.out.println("1. 제목");
		System.out.println("2. 저자");
		System.out.println("3. 제목 또는 저자");
		int selectedMenu = scanner.nextInt();
		if(selectedMenu >3) {
			System.out.println("잘못 선택했습니다.");
			return;
		}
		System.out.println("검색어를 입력하세요.(검색어는 제목을 포함하면 검색, 저자는 일치해야 검색.)");
		String searchWord = scanner.next();
		int count = 0;
		
		if(selectedMenu == 2) {
			ArrayList<Book> rBooks = bookmap.get(searchWord);
			if(rBooks == null) {
				System.out.println("검색 결과는 " + count + "건 입니다.");
				return;
			}
			Iterator<Book> it = rBooks.iterator();
			while(it.hasNext()) {
				System.out.println(it.next().toString());
				count++;
			}
		}	
		
		else {
			for (int i=0; i<books.size(); i++) {
				if ((selectedMenu == 1 && books.get(i).includeTitle(searchWord))
				|| (selectedMenu == 3 && books.get(i).includeTitleOrAuthor(searchWord))) {
					System.out.println(books.get(i).toString());
					count++;				
				}		
			}			
		}		
		
	}

}

