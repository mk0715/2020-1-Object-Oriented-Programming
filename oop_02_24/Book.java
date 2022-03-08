package oop_02_24;

class Book {
	private String ISBN = "";
	private String title = "";
	private String author = "";
	// static으로 지정하게 되면 계속 덮어써지기 때문에 non-static으로 설정.
	
	
	Book(String ISBN, String title, String author) {
		
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		
	}
	
	//2) 어떤 조건에서는 올리고 어떤 조건에서는 안올릴때 
	//void increaseCount() {
		//count++;
	//}
	
	boolean includeTitle(String subtitle) {  // Library에서 사용하기 때문에 최소 default
		return (title.indexOf(subtitle) != -1);   // indexOf가 없는단어면 -1반환하므로 -1이 아닌것 즉, 있는 단어가 있으면 true반환하는것.
	}
	
	boolean includeAuthor(String subAuthor) {
		return (author.indexOf(subAuthor) != -1);
	}
	
	boolean includeTitleOrAuthor(String subWord) {
		return (author.equals(subWord) || title.indexOf(subWord) != -1);
	}
	
	public String toString() {
		return "ISBN: " + ISBN + " 제목: " + title + " 저자: " + author;
	}
	
}
