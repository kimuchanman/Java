package algorizm;
import java.util.Scanner;
public class PutAstterisk1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������\�����܂����F");
		int n = stdIn.nextInt();
		
		int i= 0;
		while(i < n){
			System.out.print('*');
			i++;
		}
		System.out.println();
	}

}
