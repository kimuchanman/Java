package object;

//日付クラスDay【第１版】

class Day1 {
	private int year;				// 年
	private int month;			// 月
	private int date;				// 日

	//--- コンストラクタ ---//
	Day1(int year, int month, int date) {
		this.year  = year;		// 年	
		this.month = month;		// 月
		this.date  = date;		// 日
	}

	//--- 年・月・日を取得 ---//
	int getYear()  { return year; }		// 年を取得
	int getMonth() { return month; }		// 月を取得
	int getDate()  { return date; }		// 日を取得

	//--- 年・月・日を設定 ---//
	void setYear(int year)   { this.year  = year; }		// 年を設定
	void setMonth(int month) { this.month = month; }	// 月を設定
	void setDate(int date)   { this.date  = date; }		// 日を設定

	void set(int year, int month, int date) {				// 年月日を設定
		this.year  = year;			// 年	
		this.month = month;			// 月
		this.date  = date;			// 日
	}

	//--- 曜日を求める --//
	int dayOfWeek() {
		int y = year;						// 0 … 日曜日
		int m = month;						// 1 … 月曜日
		if (m == 1 || m == 2) {			//　 ：
			y--;								// 5 … 金曜日
			m += 12;							// 6 … 土曜日
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
}

//日付クラスDay【第１版】利用例（その１：日付を表示）



class DayTester1 {

	public static void main(String[] args) {
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

		for (int i=1; i<5; i++){
			int y = i * 500;
			int m = 1;
			int d = 1;
			Day1 birthday = new Day1(y, m, d);

			System.out.println(
									 + birthday.getYear()  + "年"
									 + birthday.getMonth() + "月"
									 + birthday.getDate()  + "日は"
									 + wd[birthday.dayOfWeek()] + "曜日です。");
		}
		
	}
}
