package algorizm;
import java.util.Scanner;
public class kouyakusuu {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int input_a = a.nextInt();
		Scanner b = new Scanner(System.in);
		int input_b = b.nextInt();
		int i;
		
		if(input_a > input_b){
			for(i=input_a;i>=1;i--){
				if(input_a%i == 0 && input_b%i == 0){
					System.out.println(i);
					break;
				}
			}
		}else{
			for(i=input_b;i>=1;i--){
				if(input_b%i == 0 && input_a%i == 0){
					System.out.println(i);
					break;
				}
			}
		}
		/*
		for(i=1;i<=input_a*input_b;i++){
			if(i%input_a == 0 && i%input_b == 0){
				System.out.println(i);
				break;
			}
		}
		*/
		// TODO 自動生成されたメソッド・スタブ

	}

}
