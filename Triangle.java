class Triangle {
	private double b = 1.0;
	private double h = 1.0;	//初期値はともに1.0
	
	Triangle(){}
	//methodのオーバーライド
	Triangle(double b, double h){
		this.b = b;
		this.h = h;
	}
	//アクセッサの作成
	double getBase()	{ return b; }
	double getHeight()	{ return h; }
	
	void setBase(double b)	{ this.b = b; }
	void setHeight(double h)	{ this.h= h; }
  
	//面積の計算	
  double calcArea(){
		double base = b;
		double height = h;
		return (base * height / 2);
	}
}
