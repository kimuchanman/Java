package object;

public class MultilingualBookTester {

	public static void main(String[] args) {
		MultilingualBook a = new MultilingualBook("VictorHugo","LesMiserable","A.Lacroix,Ver-boeck-hover&Ce.",1862,"フランス語","true","黒岩涙香","噫無情","萬朝報");
		MultilingualBook b = new MultilingualBook("LewisCarroll","Alice's Adventures in Wonderland","Macmillan Publishers",1865,"英語","true","高山宏","不思議の国のアリス","東京図書");
		
		a.showBook();
		b.showBook();

	}

}
