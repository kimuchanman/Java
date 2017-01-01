package algorizm;
import java.io.*;
public class fib {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(8));
	}
	
	private static int fibonacci(int i){
		int[] fibonacci = new int[i];
		if(i == 0){
			return 0;
		}else if(i == 1){
			return 1;
		}else{
			return fibonacci(i-1) + fibonacci(i-2);
		}
	}
}