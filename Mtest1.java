
class Mtest1{
	public static void main(String[] args){
		double a = 2*Math1.sin(0.7) + Math1.cos(0.5);
		System.out.println("a = " + a);
		
		double b = 1/( 2*Math1.sin(0.8) + Math1.cos(0.2) );
		System.out.println("b = " + b);
		
		double c = 0;
		double answer_c = 0;
		
		for( int i = 1; i < 6; i++){
			c = 2*Math1.tan(i/10) + Math1.tan(2*i/10);
			answer_c += c; 
		}
		System.out.println("c = " + answer_c);
	}
}