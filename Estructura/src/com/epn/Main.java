package com.epn;

public class Main {

	public static void main(String[] args) {
		
		
		
				//cIRCULO
				Punto punto = new Punto(1,1);
				double r=5;
				
				Circulo circulo = new Circulo(r,punto);
				String salida="";
				salida+=circulo.toString()+"\nEl AREA DEL CIRCULO ES:  "+circulo.calculoArea();
				
				System.out.println(salida);
				//TRIANGULO	
				Punto p1 = new Punto(1,1);
				Punto p2 = new Punto(0,1);
				Punto p3 = new Punto(1,0);
				
				
				Triangulo triangulo = new Triangulo(p1,p2,p3);	
				
				System.out.println("Es un triángulo?"+triangulo.verificadorT(triangulo.calculoArea()));
				System.out.println("EL AREA DEL TRIANGULO ES"+triangulo.calculoArea());
				
				//CUADRADO
			
				Punto c1 = new Punto(0,0);
				Punto c2 = new Punto(0,2);
				Punto c3 = new Punto(2,2);
				Punto c4 = new Punto(2,0);
				
				Cuadrilatero cuadro = new Cuadrilatero(c1,c2,c3,c4);
				
				System.out.println("EL AREA DEL CUADRADO ES"+ cuadro.calculoArea() );
				

	}
	}	
	


