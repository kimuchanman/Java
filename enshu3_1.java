package Scanner;

import java.util.Scanner;

public class enshu3_1 {
	public static void main(String[] args) {
		
	
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("�����l�F");
	double r = stdIn.nextDouble();
	
	if(r > 0 || r == 0){
		System.out.println("���̐�Βl��" + r + "�ł��B");
	}
		else{
			r = -1*r;
			System.out.println("���̐�Βl��" + r + "�ł��B");
		}
	}
}
