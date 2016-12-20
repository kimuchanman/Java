package object;

import java.util.Scanner;

class a7_30 {

	//--- a, bの最小値を返却 ---//
	static int min(int a, int b) {
		return a < b ? a : b;
	}

	//--- a, b, cの最小値を返却 ---//
	static int min(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
	}

	static int min(int[] a){
		int min = a[0];
		for(int i=0; i<a.length; i++){
			if(a[i] < min) min = a[i];
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("aの値：");  int x = stdIn.nextInt();
		System.out.print("bの値：");  int y = stdIn.nextInt();
		System.out.print("cの値：");  int z = stdIn.nextInt();
		
		System.out.print("配列aの要素数は：");
		int n = stdIn.nextInt();		// 要素数
		int[] a = new int[n];			// 要素数nの配列

		for (int i = 0; i < n; i++){
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		// 二値の最小値
		System.out.println("x, yの最小値は" + min(x, y) + "です。");

		// 三値の最小値
		System.out.println("x, y, zの最小値は" + min(x, y, z) + "です。");
		
		// 配列aの最小値
		System.out.println("配列aの要素の最小値は" + min(a) + "です。");
	}
}
