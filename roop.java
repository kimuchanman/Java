package algorizm;
import java.util.Scanner;
public class roop {

	public static void main(String[] args) {
		String a;
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�������͂��Ă�������");
		a = stdIn.next();
		if(a == ""){
		System.out.print("�������͂��Ă�������");
		}else if(a == "exit"){
			System.out.println("�I���܂�");
		}else{
			System.out.println(a);
		}
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
