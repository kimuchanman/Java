package algorizm;
import java.util.Scanner;
import java.util.Random;
public class ABC {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		a = 2;
		int b = -1;
		
		double x = 1.5*2;
		
		final double PI = 3.14;
		x = rand.nextDouble();
		System.out.println(PI*x*x);
		
		System.out.print("整数aの値：");
		a = stdIn.nextInt();
	
		System.out.println(a);
		
		String s = "ABC";
		System.out.println(s);
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
