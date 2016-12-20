package object;

import java.util.Random;
import java.util.Scanner;

class a7_8 {

	//--- a以上b未満の乱数を返す ---//
	static int random(int a, int b) {
		if(b<a)
			return a;	//b
		if(a==b)
			return a;
		
		int c = b-a;
		Random rand1 = new Random();
		int lucky1 = rand1.nextInt(c);	
		lucky1 = lucky1 + a;// a～bの乱数
		
		return lucky1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a以上b未満の乱数を与えます。");
		System.out.print("実数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		System.out.println(a + "以上" + b + "未満の乱数を生成しました。" + random(a, b) + "です。");
	}
}
