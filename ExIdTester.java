package object;

/*演習10-2
演習10-1で作成したクラスIdを,インスタンスを生成するたびに
識別番号をnずつ増やして与えるように変更したクラスExIdを作成せよ.
nはメソッドを通じて取得変更できるようにすること
 */

import java.util.Scanner;

class ExId {
	static int counter = 0;
	private static int n=1;

	private int id;
	
	public ExId() {
		counter += n;
		id = counter;
	}

	public int getId() {
		return id;
	}
	
	public static int getMaxId(){
		return counter;
	}
	public static int getN(){
		return n;
	}
	public static void setN(int i){
		n = i;
	}
}

public class ExIdTester {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("いくつ表示しますか？：");
		int j = stdIn.nextInt();	
		System.out.println("n="+ExId.getN());
		for (int i = 0; i < j ; i++){
			ExId a = new ExId();
			System.out.println("a[" + i + "]の識別番号:" + a.getId());
		}
		
		System.out.print("nを何に変更しますか：");
		int n = stdIn.nextInt();
		System.out.print("何個表示しますか：");
		int k = stdIn.nextInt();
		ExId.setN(n);
		for (int i = 0; i < k ; i++){
			ExId b = new ExId();
			System.out.println("b[" + i + "]の識別番号:" + b.getId());
		}
		int max = ExId.getMaxId();
		System.out.println("最後に与えた識別番号："+ max);
		System.out.println("次に与える識別番号：" + ( max + n));
	}
}