//instance method make,引数受け取らない
class Math3 {
	double x = 0.0;
	Math3(double x) { this.x = x; }
	void setX(double x) { this.x = x; }
	double getX(){ return x; }
	
	//sinのインスタンスメソッド
	double sin(){ return Math.sin(x); }
	//cosのインスタンスメソッド
	double cos(){ return Math.cos(x); }
	//tanのインスタンスメソッド
	double tan(){ return Math.tan(x); }
	
	//PIの省略可能なsinのインスタンスメソッド
	double sin2(){ return Math.sin(Math.PI*(x)); }
	//PIの省略可能なcosのインスタンスメソッド
	double cos2(){ return Math.cos(Math.PI*(x)); }
	//PIの省略可能なtanのインスタンスメソッド
	double tan2(){ return Math.tan(Math.PI*(x)); }
}

