package object;

import java.util.Scanner;

	public class a4_8 {

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);

			int n;
			int count = 0;
			System.out.print("整数値：");
			n = stdIn.nextInt();
			
			while(n>0){
				n = n/10;
				count++;
			}
			
			System.out.println("その値は" + count + "桁です。");
		}
	}

