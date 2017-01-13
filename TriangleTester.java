import java.lang.Math;
import java.util.Scanner;

public class TriangleTester{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("底辺を入力せよ："); 	double b = stdIn.nextDouble();
		System.out.print("高さを入力せよ："); 	double h = stdIn.nextDouble();
		
		Triangle tmp = new Triangle(b,h);
		
		System.out.println("面積 = " + tmp.calcArea());
	}
}
