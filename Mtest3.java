
public class Mtest3 {

	public static void main(String[] args) {
		Math3 a = new Math3( 0.5 );		//a = 0.5*PI
		Math3 b = new Math3( 0.7 );		//b = 0.7*PI
		double ans_1 = a.cos2() + 2*b.sin2();
		System.out.println("cos(" + a.getX() + ") + 2sin(" + b.getX() + ") = " + ans_1);
		
		Math3 c = new Math3( 0.8 );		//c = 0.8*PI
		Math3 d = new Math3( 0.2 );		//d = 0.2*PI
		double ans_2 = 1/( 2*c.sin2() + d.cos2());
		System.out.println("1/( 2*sin(" + c.getX() + ") + cos(" + d.getX() + ") ) = " + ans_2);

		
		double ans_3 = 0;
		for( int i = 1; i < 6; i++ ){
			Math3 k1 = new Math3( i/10 );
			Math3 k2 = new Math3( i/5 );
			double tmp = 2*k1.tan2() + k2.tan2();
			ans_3 += tmp; 
		}
		System.out.println("answer3 = " + ans_3);
	}

}
