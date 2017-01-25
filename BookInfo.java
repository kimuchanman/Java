package object;

public class BookInfo {
	//フィールド
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
	//出版社を調べる
	public String getPublisher() { return publisher; };
	//出版年を調べる
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

class MultilingualBook extends BookInfo{
	//フィールド
	private String language;
	private String presence;
	private String translator;
	private String rendering;
	private String rend_pub;
	
	//コンストラクタ
	public MultilingualBook(String author,String title,String publisher,int year,String language,String presence,String translator,String rendering,String rend_pub){
		super(author,title,publisher,year);	//スーパークラスのコンストラクタ
		this.language = language;
		this.presence = presence;
		this.translator = translator;
		this.rendering = rendering;
		this.rend_pub = rend_pub;
		
	}
	//アクセッサの作成↓
	//使用言語を調べる
	public String getLanguage() { return language; };
	//訳書の有無を調べる
	public String getPresence() { return presence; };
	//訳者名を調べる
	public String getTranslator() { return translator; };
	//訳書名を調べる
	public String getRendering() { return rendering; };
	//訳書出版社を調べる
	public String getRend_pub() { return rend_pub; };
	
	public void showBook() {
		if(language == "日本語")
			super.showBook();
		else{
			super.showBook(); 
			System.out.println(language + " " + presence + " " + translator + " " + rendering + " " + rend_pub); 
		}
			
		
	}
}