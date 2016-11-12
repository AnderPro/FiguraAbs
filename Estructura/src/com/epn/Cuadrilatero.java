package com.epn;

public class Cuadrilatero extends FiguraGeometrica {
	private Punto p1;
	private Punto p2;
	private Punto p3;
	private Punto p4;
	
	
	public Cuadrilatero() {
		super();
	}


	public Cuadrilatero(Punto p1, Punto p2, Punto p3, Punto p4) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	

	public Punto getP1() {
		return p1;
	}


	public void setP1(Punto p1) {
		this.p1 = p1;
	}


	public Punto getP2() {
		return p2;
	}


	public void setP2(Punto p2) {
		this.p2 = p2;
	}


	public Punto getP3() {
		return p3;
	}


	public void setP3(Punto p3) {
		this.p3 = p3;
	}


	public Punto getP4() {
		return p4;
	}


	public void setP4(Punto p4) {
		this.p4 = p4;
	}
	
	

	@Override
	public double calculoArea() {
		double area= Math.abs(p1.getX()*(p2.getY()-p4.getY()) + p2.getX()*(p3.getY()-p1.getY()) + p3.getX()*(p4.getY()-p2.getY()) + p4.getX()*(p1.getY()-p3.getY()));
		//double area=0.5*Math.abs((p1.getX()*p2.getY()+p2.getX()*p3.getY()+p3.getX()*p4.getY()+p4.getX()*p1.getY())-(p1.getY()*p2.getX()+p2.getY()*p3.getX()+p3.getY()*p4.getX()+p4.getY()*p1.getX())); 

		return 	area*0.5;	

	}

}
