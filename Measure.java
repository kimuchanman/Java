import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		for(int i=1; i<=n ;i++){
			if(n%i == 0)
				System.out.println(i);
		}
	}

}
