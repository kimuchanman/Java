class Prism {
	private double b = 1.0;
	private double h = 1.0;
	private double k = 1.0;	//�����l�͂Ƃ���1.0
	
	Prism(){}
	//method�̃I�[�o�[���C�h
	Prism(double b, double h,double k){
		this.b = b;
		this.h = h;
		this.k = k;
	}
	//�A�N�Z�b�T�̍쐬
	double getBase()	{ return b; }
	double getHeight()	{ return h; }
	double getK()	{ return k; }
	
	void setBase(double b)	{ this.b = b; }
	void setHeight(double h)	{ this.h = h; }
	void setK(double k)	{ this.k = k; }
	//�̐όv�Z
	double calcVol(){
		double base = b;
		double height = h;
		double taka = k;
		return (base * height / 2 * taka);
	}
	//�\�ʐόv�Z
	double calcArea(){
		double base = b;
		double height = h;
		double taka = k;
		return ( base * height + (base * taka * 3) );
	}
	
}
