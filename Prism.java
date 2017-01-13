class Prism {
	private double b = 1.0;
	private double h = 1.0;
	private double k = 1.0;	//初期値はともに1.0
	
	Prism(){}
	//methodのオーバーライド
	Prism(double b, double h,double k){
		this.b = b;
		this.h = h;
		this.k = k;
	}
	//アクセッサの作成
	double getBase()	{ return b; }
	double getHeight()	{ return h; }
	double getK()	{ return k; }
	
	void setBase(double b)	{ this.b = b; }
	void setHeight(double h)	{ this.h = h; }
	void setK(double k)	{ this.k = k; }
	//体積計算
	double calcVol(){
		double base = b;
		double height = h;
		double taka = k;
		return (base * height / 2 * taka);
	}
	//表面積計算
	double calcArea(){
		double base = b;
		double height = h;
		double taka = k;
		return ( base * height + (base * taka * 3) );
	}
	
}
