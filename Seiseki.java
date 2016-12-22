
public class Seiseki {
	String course;
	String category;
	int credit;
	int grade;
}

class SeisekiTester{
	public static void main(String[] args) {
		Seiseki s = new Seiseki();
		s.grade = 3;
		s.category = "専門科目";
		s.credit = 2;
		s.course = "プロジェクト実験";
		System.out.println("科目名： " + s.course);
		System.out.println("種目： " + s.category);
		System.out.println("単位： " + s.credit);
		System.out.println("成績： " + s.grade);
		// TODO 自動生成されたメソッド・スタブ

	}

}
