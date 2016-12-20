package object;

import java.util.Scanner;

public class Seiseki {
	private String course = "特別研究";
	private String category = "専門科目";
	private int credit = 6;
	private int grade = 5;
	
	//コントラスタの多重定義
	Seiseki()														{	}
	Seiseki(String course)											{ this.course = course; }
	Seiseki(String course, String category)							{ this(course); this.category = category;	}
	Seiseki(String course, String category, int credit)				{ this(course, category); this.credit = credit;	}
	Seiseki(String course, String category, int credit, int grade)	{ this(course, category, credit); this.grade = grade;	}

	
	public void array(){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("科目名：");
		String co = stdIn.next();
		
		System.out.print("種目：");
		String ca = stdIn.next();
		
		String b[] = {co,ca};
		
		this.course = b[0];
		this.category = b[1];
		
		System.out.print("単位：");
		int c = stdIn.nextInt();
		
		System.out.print("成績：");
		int g = stdIn.nextInt();
		
		int a[] = {c,g};
		this.credit = c;
		this.grade = a[1];
		
		System.out.println(b[0] + " " + b[1] + " " + a[0] + " " + a[1]);
	}

	//ゲッタの生成
	//コース
	public String getCourse(){
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	//科目
	public String getCategory(){
		return category;	
	}
	public void setCategory(String category) {
		this.category = category;
	}
	//単位、なお単位数は1,2,4以外は認めない
	public int getCredit(){
		return credit;	
	}
	public void setCredit(int credit) {
		if(credit!=1 && credit!=2 && credit!=4){
			credit = 2;
		}
		this.credit = credit;
	}
	//成績、なお成績は0以上5以下でなくてはならない
	public int getGrade(){
		return grade;	
	}
	public void setGrade(int grade) {
		if( grade<=-1 ||  grade>=6){
			 grade = 0;
		}
		this.grade =  grade;
	}

	//成績の評価
	public String getGradeName(int grade){
		switch(grade){

		case 0: System.out.println("不可"); return "不可";
		case 1: System.out.println("不可"); return "不可";
		case 2: System.out.println("可"); return "可";
		case 3: System.out.println("良"); return "良";
		case 4: System.out.println("優"); return "優";
		case 5: System.out.println("優"); return "優";

		}
		return "適切な成績ではありません";
	}

	//フィールドの値を画面に表示
	public String printSeiseki(String course, String category, int credit, int grade){
		String a = getGradeName(grade);
		return (course +" "+ category +" "+ credit +" "+ a);
	}
	//toString メソッド
	public String toString(){
		return (course +" "+ category +" "+ credit +" "+ grade);
	}

}

class SeisekiTester{
	public static void main(String[] args) {
		System.out.print("何科目入力しますか？：");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		
		
		for(int i=0; i<x; i++){
			Seiseki s = new Seiseki();
			s.array();
			System.out.println(s.printSeiseki(s.getCourse(), s.getCategory(), s.getCredit(), s.getGrade()));
		}
		
	}

}
