
class Math1 {
	static double sin(double x){ return Math.sin(Math.PI*(x)); }
}

class Mtest1{
	public static void main(String[] args){
		double b = Math1.sin(0.5);
		System.out.println("b = " + b);
	}
}