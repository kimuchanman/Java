package algorizm;
import java.io.*;

class fib2 {

    public static void main(String args[]) throws Exception {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("input natural number: ");
	int number = (new Integer(in.readLine())).intValue();

	/* フィボナッチ計算の呼び出しと表示 */
	System.out.println("Fibonacci[" + number + "] = " + fibonacci(number));

    }

    static int fibonacci(int number) {

	int fib[] = new int[number + 1];		//フィボナッチ数計算用配列

	fib = new int[number + 1];

	/* フィボナッチ計算 */
	fib[0] = 0;
	if(number != 0){
    fib[1] = 1;
    if(number != 1){
    	for (int i = 2; i <= number; i++) {
    		fib[i] = fib[i-1] + fib[i-2];
    		}
    }
	}

	return(fib[number]);
	
    }

}

