package object;

import java.util.Scanner;	

class a7_22 {

	//--- 全要素がインデックスと同じ値をもつ要素数nの配列を生成して返却 ---//
	static int[] arrayClone(int[] a) {
		int[] b = new int[a.length];			// 要素数nの配列
		for(int i=0; i < a.length; i++)
			b[i] = a[i];
		return b;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数は：");
		int n = stdIn.nextInt();		// 要素数
		int[] a = new int[n];			// 要素数nの配列

		for (int i = 0; i < n; i++){
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		int[] b = arrayClone(a);
		for(int i = 0; i < n; i++)
			System.out.println("b[" + i + "] = " + b[i]);
	}
}
