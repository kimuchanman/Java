import java.util.Scanner;

public class PrismTester{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("底辺を入力せよ："); 	double b = stdIn.nextDouble();
		System.out.print("底面の高さを入力せよ："); 	double h = stdIn.nextDouble();
		System.out.print("三角柱の高さを入力せよ："); 	double k = stdIn.nextDouble();
		
		Prism tmp = new Prism(b,h,k);
		
		System.out.println("面積 = " + tmp.calcArea() + "平方cm");
		System.out.println("体積 = " + tmp.calcVol() + "立方cm");
	}
}
