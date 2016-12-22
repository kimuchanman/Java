import java.util.Random;
import java.util.Scanner;


class MentalArithmetic {
	static Scanner stdIn = new Scanner(System.in);
	
	static boolean confirmRetry(){
		int cout;
		do{
			System.out.print("もう一度？<Yes...1/No...0> : ");
			cout = stdIn.nextInt();
		} while (cout != 0 && cout != 1);
		return cout == 1;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("暗算力トレーニング！！");
		do{
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			while(true){
				if(x%4 == 0){
					System.out.print(x + " + " + y + " + " + z + " = ");
					int k = stdIn.nextInt();
					if (k== x+y+z)
						break;
					System.out.println("違いますよ！");
				}
				else if(x%4 == 1){
					System.out.print(x + " + " + y + " - " + z + " = ");
					int k = stdIn.nextInt();
					if (k== x+y-z)
						break;
					System.out.println("違いますよ！");
				}
				else if(x%4 == 2){
					System.out.print(x + " - " + y + " + " + z + " = ");
					int k = stdIn.nextInt();
					if (k== x-y+z)
						break;
					System.out.println("違いますよ！");
				}
				else if(x%4 == 3){
					System.out.print(x + " - " + y + " - " + z + " = ");
					int k = stdIn.nextInt();
					if (k== x-y-z)
						break;
					System.out.println("違いますよ！");
				}
			}
		}while(confirmRetry());
		// TODO 自動生成されたメソッド・スタブ

	}

}
