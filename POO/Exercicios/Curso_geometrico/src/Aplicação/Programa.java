package Aplicação;

	import java.util.Locale;
import java.util.Scanner;

import Entidades.Retangulo;
import Entidades.Triangulo;
	public class Programa {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	
	int entidade, w;
	Triangulo  x, y;
	x = new Triangulo();
	y = new Triangulo();
	
	Retangulo a;
	a = new Retangulo();
	
	
	
	System.out.printf("\t\t____Calculadora de Poligonos____");
	
	do {
		
	System.out.printf("\n\n Digite qual poligono você deseja calcular:\n");
	System.out.println("1- Triangulo_");
	System.out.println("2- Retangulo_");
	entidade = sc.nextInt();
	
	switch (entidade) {
	case 1: // triangulo
		System.out.println("Entre com as medidas de X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
	System.out.println("Entre com as medidas de Y: ");
		y.a= sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		

		double areaX = x.area();
		double areaY = y.area();
		
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
		System.out.println("Larger area: X");
			}else {
		System.out.println("Larger area: Y");
			}
		
		break;
	case 2: // Retangulo
		System.out.println("Entre com a Altura do rentangulo: ");
		a.altura = sc.nextDouble();
		
	System.out.println("Entre com a Largura do rentangulo: ");
		a.largura= sc.nextDouble();
		
		double areaR = a.area();
		System.out.printf("Area: %.2f%n", areaR);
		
		double perimetroR = a.perimetro();
		System.out.printf("Perimetro: %.2f%n", perimetroR);
		
		double diagonalR = a.diagonal();
		System.out.printf("Diagonal: %.2f%n", diagonalR);
		
		break;
	
	default:
		System.out.println("Escolha um poligono geometrico para o calculo!");
		break;
	}
	
	
	
	System.out.printf("%n%nGostaria de tentar novamente?(1 ou 0)");
	w = sc.nextInt();
	
	
	}
	
	while (w==1);
	System.out.println("ok, tenha um otimo dia!");
		
	
		sc.close();
		}
	}
