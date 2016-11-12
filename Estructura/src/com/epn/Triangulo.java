package com.epn;

public class Triangulo extends FiguraGeometrica {
	private Punto p1;
	private Punto p2;
	private Punto p3;
	

	
	public Triangulo(Punto p1, Punto p2, Punto p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}


public boolean verificadorT(Double area){
	if (area!=0){
		return true;
	}else{
		return false;
	}
}

	@Override
	public double calculoArea() {
			//Área = 1/2 * | X1 * (Y2 - Y3) + X2 * (Y3 - Y1) + X3 * (Y1 - Y2) |”
		double area=(Math.abs(p1.getX()* (p2.getY()-p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY())));
		return   area/2;
	}

}
