package algorizm;
import java.util.Scanner;
public class roop_a {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String input = "";
		
		for(;;){
			System.out.print("��������");
			input = a.nextLine();
			if(input.length() == 0){
				System.out.println("�������͂���Ă��܂���");
			}else if(input.equals("exit")){
				break;
			}else{
				System.out.println(input);
			}
		}
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
