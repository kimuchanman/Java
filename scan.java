package Scanner;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		final double PI = 3.1416;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���a�F");
		double r = stdIn.nextDouble();
		
		System.out.println("�~���̒�����" + 2*PI*r + "�ł��B");
		System.out.println("�ʐς�" + PI*r*r + "�ł��B");
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
