package algorizm;
import java.util.Scanner;
public class roop_a {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String input = "";
		
		for(;;){
			System.out.print("何か入力");
			input = a.nextLine();
			if(input.length() == 0){
				System.out.println("何も入力されていません");
			}else if(input.equals("exit")){
				break;
			}else{
				System.out.println(input);
			}
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
