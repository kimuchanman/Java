package object;

public class BookInfoTester {

	public static void main(String[] args) {
	BookInfo a = new BookInfo("夏目漱石","坊っちゃん","春陽堂",1907);
	BookInfo b = new BookInfo("森鴎外","舞姫","民友社",1890);
	BookInfo c = new BookInfo("永井荷風","あめりか物語","博文館",1908);
	BookInfo d = new BookInfo("村上龍","五分後の世界","幻冬舎",1994);
	BookInfo e = new BookInfo("村上春樹","1Q84","新潮社",2009);
	
	a.showBook();
	b.showBook();
	c.showBook();
	d.showBook();
	e.showBook();

	}

}
