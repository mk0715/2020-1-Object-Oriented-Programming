package oop_02_13;

class Book {
	private String title = "";
	private String author = "";
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	boolean includeTitle(String subtitle) {  // Library에서 사용하기 때문에 최소 default
		return (title.indexOf(subtitle) != -1);   // indexOf가 없는단어면 -1반환하므로 -1이 아닌것 즉, 있는 단어가 있으면 true반환하는것.
	}
	
	boolean includeAuthor(String subAuthor) {
		return (author.indexOf(subAuthor) != -1);
	}
	
	boolean includeTitleOrAuthor(String subWord) {
		return (title.indexOf(subWord) != -1 || author.indexOf(subWord) != -1);
	}
	
	public String toString() {
		return "제목: " + title + " 저자: " + author;
	}

}
