package object;


import java.util.Scanner;

public class tanni {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("取得単位数をそれぞれ入力せよ");
		System.out.print("文系の教養科目群：");
		int a = stdIn.nextInt();
		System.out.println("あと" +(6-a)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("理系の教養科目群：");
		int b = stdIn.nextInt();
		System.out.println("あと" +(6-b)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("基盤科目群：");
		int c = stdIn.nextInt();
		System.out.println("あと" +(2-c)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("基礎ゼミナール：");
		int d = stdIn.nextInt();
		System.out.println("あと" +(2-d)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("情報リテラシー実践：");
		int e = stdIn.nextInt();
		System.out.println("あと" +(2-e)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("言語科目：");
		int f = stdIn.nextInt();
		System.out.println("あと" +(8-f)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("保健体育科目：");
		int g = stdIn.nextInt();
		System.out.println("");
		
		System.out.print("理系共通基礎科目：");
		int h = stdIn.nextInt();
		System.out.println("あと" +(24-h)+ "単位必要です。");
		System.out.println("");
		
		//必修科目の判定、取ってなかったらプログラムを終了する
		System.out.print("微分積分Ⅰは取っていますか？(0・・・Yes/ 1・・・No)：");
		int s1 = stdIn.nextInt();
		if(s1 == 1){
			System.out.println("それ取らないと卒業できません");
			System.exit(0);
		}
		System.out.println("");
		
		System.out.print("線形代数Ⅰは取っていますか？(0・・・Yes/ 1・・・No)：");
		int s2 = stdIn.nextInt();
		if(s2 == 1){
			System.out.println("それ取らないと卒業できません");
			System.exit(0);
		}
		System.out.println("");
		
		System.out.print("微分積分Ⅱは取っていますか？(0・・・Yes/ 1・・・No)：");
		int s3 = stdIn.nextInt();
		if(s3 == 1){
			System.out.println("それ取らないと卒業できません");
			System.exit(0);
		}
		System.out.println("");
		
		System.out.print("線形代数Ⅱは取っていますか？(0・・・Yes/ 1・・・No)：");
		int s4 = stdIn.nextInt();
		if(s4 == 1){
			System.out.println("それ取らないと卒業できません");
			System.exit(0);
		}
		System.out.println("");
		
		System.out.print("工学系電気回路は取っていますか？(0・・・Yes/ 1・・・No)：");
		int s5 = stdIn.nextInt();
		if(s5 == 1){
			System.out.println("それ取らないと卒業できません");
			System.exit(0);
		}
		System.out.println("");
		
		System.out.print("情報通信工学基礎科目：");
		int j = stdIn.nextInt();
		System.out.println("あと" +(10-j)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("情報工学分野科目：");
		int k = stdIn.nextInt();
		System.out.println("あと" +(12-k)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("通信工学分野科目：");
		int l = stdIn.nextInt();
		System.out.println("あと" +(12-l)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("情報通信応用分野科目：");
		int m = stdIn.nextInt();
		System.out.println("あと" +(10-m)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("情報通信システム演習科目：");
		int n = stdIn.nextInt();
		System.out.println("あと" +(2-n)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("実験科目：");
		int o = stdIn.nextInt();
		System.out.println("あと" +(8-o)+ "単位必要です。");
		if(o!=8){
			System.out.println("実験科目が足りないので卒業できません");
		}
		System.out.println("");
		
		System.out.print("特別研究：");
		int p = stdIn.nextInt();
		System.out.println("あと" +(8-p)+ "単位必要です。");
		System.out.println("");
		
		System.out.print("学部共通科目：");
		int q = stdIn.nextInt();
		System.out.println("");
		
		System.out.print("卒業まであと"+(128-a-b-c-d-e-f-g-h-j-k-l-m-n-o-p-q)+"単位必要です");

	}


}
