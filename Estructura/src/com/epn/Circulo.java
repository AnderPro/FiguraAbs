package com.epn;

public class Circulo extends FiguraGeometrica {
	private double radio;
	private Punto centro;
	
	
	public Circulo() {
		super();
	}




	public Circulo(double radio, Punto centro) {
		super();
		this.radio = radio;
		this.centro = centro;
	}
	



	public double getRadio() {
		return radio;
	}




	public void setRadio(double radio) {
		this.radio = radio;
	}




	public Punto getCentro() {
		return centro;
	}




	public void setCentro(Punto centro) {
		this.centro = centro;
	}




	@Override
	public double calculoArea() {
		// TODO Auto-generated method stub
		return Math.pow(radio, 2)*Math.PI;
	}




	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "/n";
	}
	

}
