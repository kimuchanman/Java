import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] a = new int[5];
		
		int[] b = {1,2,3,4,5};
		
		for (int i=0; i<a.length; i++)
			System.out.println("a["+i+"] = " + a[i]);
		
		for (int i=0; i<b.length; i++)
			System.out.println("b["+i+"] = " + b[i]);
		
		for (int i=0; i<a.length; i++){
			System.out.print("a["+i+"] = ");
			a[i] = stdIn.nextInt();
		}
		
		int sum = 0;
		
		for (int i:a)
			sum += i;
		
		System.out.println("aの合計 = " + sum);
		
		int[][] c = new int[2][4];
		
		System.out.println("配列c");
		for(int i=0;i<c.length;i++){
			for(int j=0; j<c[i].length; j++)
				System.out.printf("%3d", c[i][j]);
			System.out.println();
		}
		
		int[][] d = {
				new int[5], new int[3], new int[4]
		};
		
		System.out.println("配列d");
		for (int i=0; i<d.length; i++){
			int j = 0;
			for ( ; j<d[i].length; j++)
				System.out.printf("%3d", d[i][j]);
			for ( ; j<5; j++)
				System.out.print(" -");
			System.out.println();
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
