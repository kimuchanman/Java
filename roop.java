package algorizm;
import java.util.Scanner;
public class roop {

	public static void main(String[] args) {
		String a;
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何か入力してください");
		a = stdIn.next();
		if(a == ""){
		System.out.print("何か入力してください");
		}else if(a == "exit"){
			System.out.println("終わります");
		}else{
			System.out.println(a);
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
