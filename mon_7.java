package algorizm;
import java.util.Scanner;
public class mon_7 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int input = a.nextInt();
		int[] mon = {1,2,3,5,6,7,9};
		int i;
		for(i=0;i<mon.length;i++){
			if(mon[i] == input){
				System.out.println("OK");
			}
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
