import java.util.Scanner;
import java.util.Random;
public class kazuate {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		
		System.out.println("数あてゲーム！");
		System.out.println("0～９９まで");
		
		int x,i,k;
		int j = 6;
		for(i=1;i<=j;i++){
			k = j-i+1;
			System.out.println("チャンスはあと"+k+"回！いくつかな？：");
			x = stdIn.nextInt();
			
			if(x>no)
				System.out.println("もっと小さいよ");
			if(x<no)
				System.out.println("もっと大きいよ");
			if(x==no){
			System.out.println("なかなかやるな");
			break;
			}
		}	
		System.out.println("正解は"+no+"でした");
	}
	
}
