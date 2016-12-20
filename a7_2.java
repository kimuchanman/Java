package object;

import java.util.Scanner;

class a7_2 {

	//--- a, b, cの中央値を返却 ---//
	static int med(int a, int b, int c) {
		int med = a;
		if (b > med && c > b) med = b;
		if (c > med && b > c) med = c;
		return med;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();
		System.out.print("整数c：");  int c = stdIn.nextInt();

		System.out.println("中央値は" + med(a, b, c) + "です。");
	}
}
