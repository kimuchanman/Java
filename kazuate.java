import java.util.Scanner;
import java.util.Random;
public class kazuate {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		
		System.out.println("�����ăQ�[���I");
		System.out.println("0�`�X�X�܂�");
		
		int x,i,k;
		int j = 6;
		for(i=1;i<=j;i++){
			k = j-i+1;
			System.out.println("�`�����X�͂���"+k+"��I�������ȁH�F");
			x = stdIn.nextInt();
			
			if(x>no)
				System.out.println("�����Ə�������");
			if(x<no)
				System.out.println("�����Ƒ傫����");
			if(x==no){
			System.out.println("�Ȃ��Ȃ�����");
			break;
			}
		}	
		System.out.println("������"+no+"�ł���");
	}
	
}
