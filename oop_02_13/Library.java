package oop_02_13;

import java.util.Scanner;

class Library {
	private Book[] books;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Library lib = new Library();		
		
		while(true) {
			System.out.println("이용할 메뉴를 선택하세요. ");
			System.out.println("1. 등록(한번만 등록가능합니다.)");
			System.out.println("2. 검색");
			System.out.println("3. 종료");
			
			switch (scanner.nextInt())  {
			case 1:{
				lib.registeBook();
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
	
	private void registeBook() {
		System.out.println("등록할 권수를 입력해주세요.");
		int bookCount = scanner.nextInt();
		
		books = new Book[bookCount];
		
		for (int i=0; i<bookCount; i++) {
			System.out.println("책의 제목을 입력해주세요.");
			String title = scanner.next();
			System.out.println("책의 저자를 입력해주세요.");
			String author = scanner.next();
			
			books[i] = new Book(title, author);
		}
		/*books = new Book[3];
		books[0] = new Book("자바","윤성혜");
		books[1] = new Book("과소사","윤성혜");
		books[2] = new Book("소프1","윤OO");*/
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
		System.out.println("검색어를 입력하세요.(검색어를 포함한 대상이 모두 검색됩니다.)");
		String searchWord = scanner.next();
		int count = 0;
		
		for (int i=0; i<books.length; i++) {
			if((selectedMenu == 1 && books[i].includeTitle(searchWord)) 
					|| (selectedMenu == 2 && books[i].includeAuthor(searchWord))
					|| (selectedMenu == 3 && books[i].includeTitleOrAuthor(searchWord))){
				System.out.println(books[i].toString());
				count ++;
			}
			
		}
		System.out.println("검색 결과는 " + count + "건 입니다.");
		
	}

}
