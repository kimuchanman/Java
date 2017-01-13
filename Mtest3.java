
public class Mtest3 {

	public static void main(String[] args) {
		Math3 y = new Math3( 0.5*Math.PI );
		double s = y.sin();
		System.out.println("sin(" + y.getX() + ") = " + s);

	}

}
