package object;

//銀行口座クラス【第２版】とそれをテストするクラス

//銀行口座クラス【第２版】
class Account {
	private String name;			// 口座名義
	private String no;			// 口座番号
	private long balance;		// 預金残高
	private Day openDay;

	//--- コンストラクタ ---//
	public Account(String n, String num, long z, Day openDay) {
		this.name = n;					// 口座名義
		this.no = num;					// 口座番号
		this.balance = z;				// 預金残高
		this.openDay = new Day(openDay);
	}

	//--- 口座名義を調べる ---//
	String getName() {
		return name;
	}

	//--- 口座番号を調べる ---//
	String getNo() {
		return no;
	}

	//--- 預金残高を調べる ---//
	long getBalance() {
		return balance;
	}
	//--- 口座開設日 ---/*
	public Day getOpenDay(){
		return new Day(openDay);
	}

	//--- k円預ける ---//
	void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	void withdraw(long k) {
		balance -= k;
	}
}

//銀行口座クラス【第２版】をテストするクラス
class AccountTester {

	public static void main(String[] args) {
		// 足立君の口座
		Account adachi = new Account("足立幸一", "123456", 1000, new Day(1987, 2, 18));
		// 仲田君の口座
		Account nakata = new Account("仲田真二", "654321",  200, new Day(2002, 9, 23));

		adachi.withdraw(200);					// 足立君が200円おろす
		nakata.deposit(100);						// 仲田君が100円預ける

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getName());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　預金残高：" + adachi.getBalance());
		System.out.println("　口座開設日：" + adachi.getOpenDay().toString());

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.getName());
		System.out.println("　口座番号：" + nakata.getNo());
		System.out.println("　預金残高：" + nakata.getBalance());
		System.out.println("　口座開設日：" + nakata.getOpenDay().toString());
	}
}
