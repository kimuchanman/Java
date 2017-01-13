import java.lang.Math;
import java.util.Scanner;

class Triangle {
	private double b = 1.0;
	private double h = 1.0;	//�����l�͂Ƃ���1.0
	
	Triangle(){}
	//method�̃I�[�o�[���C�h
	Triangle(double b, double h){
		this.b = b;
		this.h = h;
	}
	//�A�N�Z�b�T�̍쐬
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
		
		System.out.print("��ӂ���͂���F"); 	double b = stdIn.nextDouble();
		System.out.print("��������͂���F"); 	double h = stdIn.nextDouble();
		
		Triangle tmp = new Triangle(b,h);
		
		System.out.println("�ʐ� = " + tmp.calcArea());
	}
}
