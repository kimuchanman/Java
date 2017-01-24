package object;

public class BookInfo {
	private String author;
	private String title;
	private String publisher;
	private int year;

	//コンストラクタ
	public BookInfo(String author,String title,String publisher,int year) {
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	//著者を調べる
	public String getAuthor() { return author; };
	//題名を調べる
	public String getTitle() { return title; };
	//
	public String getPublisher() { return publisher; };
	//
	public int getYear() { return year; };
	//↑ゲッタ

	//↓セッタ
	void setAuthor(String author) { this.author = author; }
	void setTitle(String title) { this.title = title; }
	void setPublisher(String publisher) { this.publisher = publisher; }
	void setYear(int year) { this.year = year; }

	public void showBook() {
		System.out.println(author + " " + title + " " + publisher + " " + year + "年");
	}

}
