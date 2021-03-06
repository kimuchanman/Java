package algorizm;
import java.util.Scanner;
public class HanoiTower {
    public static void main(String[] args) {
    	Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        hanoi(n,'A','B','W');
    }

    static void hanoi(int n, char A, char B, char W) {
     if ( n > 0 )  {
       hanoi( n-1,A,W,B );
       System.out.println( "　" + n + "番の円盤を　 " + A + "から　 " + B + "に移動" );
       hanoi( n-1,W,B,A );
     }
    }
 }
