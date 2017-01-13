import java.lang.Math;
import java.util.Scanner;

class Triangle {
	private double b = 1.0;
	private double h = 1.0;	//初期値はともに1.0
	
	Triangle(){}
	//methodのオーバーライド
	Triangle(double b, double h){
		this.b = b;
		this.h = h;
	}
	//アクセッサの作成
	double getBase()	{ return b; }
	double getHeight()	{ return h; }
	
	void setBase(double b)	{ this.b = b; }
	void setHeight(double h)	{ this.h= h; }
	
	double calcArea(){
		double base = b;
		double height = h;
		return (base * height / 2);
	}
}

public class TriangleTester{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("底辺を入力せよ："); 	double b = stdIn.nextDouble();
		System.out.print("高さを入力せよ："); 	double h = stdIn.nextDouble();
		
		Triangle tmp = new Triangle(b,h);
		
		System.out.println("面積 = " + tmp.calcArea());
	}
}
