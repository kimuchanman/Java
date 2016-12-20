package object;

//日付クラスDay【第１版】利用例（その５：二つの日付を比較③）

import java.util.Scanner;

class DayComparator3 {

	//--- d1とd2の日付は等しいか？ ---//
	static boolean compDayOfWeek(Day d1, Day d2) {
		return d1.dayOfWeek() == d2.dayOfWeek();
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int y, m, d;
		System.out.println("日付１を入力せよ。");
		System.out.print("年：");  y = stdIn.nextInt();
		System.out.print("月：");  m = stdIn.nextInt();
		System.out.print("日：");  d = stdIn.nextInt();
		Day day1 = new Day(y, m, d);

		System.out.println("日付２を入力せよ。");
		System.out.print("年：");  y = stdIn.nextInt();
		System.out.print("月：");  m = stdIn.nextInt();
		System.out.print("日：");  d = stdIn.nextInt();
		Day day2 = new Day(y, m, d);

		if (compDayOfWeek(day1, day2))
			System.out.println("等しいです。");
		else
			System.out.println("等しくありません。");
	}
}
