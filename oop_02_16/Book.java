package oop_02_16;

class Book {
	private String title = "";
	private String author = "";
	private int id = 0; // static으로 지정하게 되면 계속 덮어써지기 때문에 non-static으로 설정.
	private static int count = 0;
	
	Book(String title, String author) {
		//1) Book이라는 객체 생성될때마다 count 추가
		count++;
		this.title = title;
		this.author = author;
		
		// id부여
		id = count;
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
		return (title.indexOf(subWord) != -1 || author.indexOf(subWord) != -1);
	}
	
	public String toString() {
		return id + " 제목: " + title + " 저자: " + author;
	}

	static int getCount() {
		return count;
	}
}
