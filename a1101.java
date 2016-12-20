package object;

//0～9のラッキーナンバーを乱数で生成して表示

import java.util.Random;

class a1101 {

	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();

		int lucky1 = rand1.nextInt(9);	
		lucky1 = lucky1 + 1;// 1～9の乱数
		
		int lucky2 = rand2.nextInt(9);	
		lucky2 = lucky2 - 9;// -1～-9の乱数
		
		int lucky3 = rand3.nextInt(90);	
		lucky3 = lucky3 + 10;// 10～99の乱数

		System.out.println("一桁の正の整数値は" + lucky1 + "です。");
		System.out.println("一桁の負の整数値は" + lucky2 + "です。");
		System.out.println("二桁の正の整数値は" + lucky3 + "です。");
	}
}
