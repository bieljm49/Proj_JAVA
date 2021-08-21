package Entidades;

public class Retangulo {
	public double largura;
	public double altura;
	
		
	public double area() {
		 double a = largura * altura;
		 return a;
	}
	
	
	public double perimetro() {
		double p = (largura + altura) * 2;
		return p;
		}
	
	public double diagonal() {
		
		double lP = Math.pow(largura, 2);
		System.out.println(lP);
		double aP = Math.pow(altura, 2);
		System.out.println(aP);
		
		double d = Math.sqrt(aP + lP);
		return d;
	}
}
