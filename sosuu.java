package algorizm;
import java.util.Scanner;
public class sosuu {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int input = a.nextInt();
		int i,j;
		
		
		
		for(i=2;i<=input;i++){
			int count=0;
			for(j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count == 2){
					System.out.println(i);	
			}	
		}
		// TODO 自動生成されたメソッド・スタブ
	}

}
