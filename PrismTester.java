import java.util.Scanner;

public class PrismTester{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ӂ���͂���F"); 	double b = stdIn.nextDouble();
		System.out.print("��ʂ̍�������͂���F"); 	double h = stdIn.nextDouble();
		System.out.print("�O�p���̍�������͂���F"); 	double k = stdIn.nextDouble();
		
		Prism tmp = new Prism(b,h,k);
		
		System.out.println("�ʐ� = " + tmp.calcArea() + "����cm");
		System.out.println("�̐� = " + tmp.calcVol() + "����cm");
	}
}
