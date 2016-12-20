package object;

import java.util.Scanner;

class a6_6 {

	public static void main(String[] args) {
		Scanner stdIn1 = new Scanner(System.in);
		Scanner stdIn2 = new Scanner(System.in);
		int sum = 0;						// 合計
		
		System.out.print("人数：");
		final int ninzu = stdIn1.nextInt();				// 人数
		int[] tensu = new int[ninzu];	// 点数

		System.out.println(ninzu + "人の点数を入力せよ。");
		
		for (int i = 0; i < ninzu; i++) {
			System.out.print((i + 1) + "番の点数：");
			tensu[i] = stdIn2.nextInt();		// tensu[i]を読み込んで
			sum += tensu[i];						// sumにtensu[i]を加える
		}
		
		int max = tensu[0];
		for (int i = 1; i < tensu.length; i++)
			if (tensu[i] > max) max = tensu[i];

		int min = tensu[0];
		for (int i = 1; i < tensu.length; i++)
			if (tensu[i] < min) min = tensu[i];

		System.out.println("合計は" + sum + "点です。");
		System.out.println("平均は" + (double)sum / ninzu + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
		
	}
}
