import java.util.Scanner;
//import java.io.*;
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		//BufferedReader = new BufferedReader(new InputStreamReader);
		//int input =reader;
		int input = a.nextInt();
		int i;
		System.out.println(input);
		
		for(i=1;i<=input;i++){
			if(i%3 == 0 && i%5 == 0){
				System.out.println(i + " : FizzBuzz");
			}else if(i%3 == 0){
				System.out.println(i + " : Fizz");
			}else if(i%5 == 0){
				System.out.println(i + " : Buzz");
			}
		}
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
