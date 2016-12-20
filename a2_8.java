package object;



	import java.util.Random;
import java.util.Scanner;
	
	public class a2_8 {

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			Random rand1 = new Random();

			int lucky1 = rand1.nextInt(11);	
			lucky1 = lucky1 - 5;// -5～5の乱数
			
			System.out.print("整数値：");
			int n = stdIn.nextInt();	// 数字を読み込む
			n = n + lucky1;

			System.out.println("その値の±５の乱数を生成しました。それは" + n + "です。");	// 表示
		}
	}


