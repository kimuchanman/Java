package algorizm;
import java.io.*;

class fib2 {

    public static void main(String args[]) throws Exception {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("input natural number: ");
	int number = (new Integer(in.readLine())).intValue();

	/* �t�B�{�i�b�`�v�Z�̌Ăяo���ƕ\�� */
	System.out.println("Fibonacci[" + number + "] = " + fibonacci(number));

    }

    static int fibonacci(int number) {

	int fib[] = new int[number + 1];		//�t�B�{�i�b�`���v�Z�p�z��

	fib = new int[number + 1];

	/* �t�B�{�i�b�`�v�Z */
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

