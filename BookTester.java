package object;

public class BookTester {
	
	static void show(BookInfo b) {
			b.showBook();
		}

	public static void main(String[] args) {
		
		BookInfo[] a = {
				new BookInfo("夏目漱石","坊っちゃん","春陽堂",1907),
				new BookInfo("森鴎外","舞姫","民友社",1890),
				new BookInfo("永井荷風","あめりか物語","博文館",1908),
				new BookInfo("村上龍","五分後の世界","幻冬舎",1994),
				new BookInfo("村上春樹","1Q84","新潮社",2009),
				new MultilingualBook("VictorHugo","LesMiserable","A.Lacroix,Ver-boeck-hover&Ce.",1862,"フランス語","true","黒岩涙香","噫無情","萬朝報"),
				new MultilingualBook("LewisCarroll","Alice's Adventures in Wonderland","Macmillan Publishers",1865,"英語","true","高山宏","不思議の国のアリス","東京図書"),
		};
		
		for (BookInfo b : a){
			show(b);
			System.out.println();
		}
		
	}

}
