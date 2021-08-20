package Aplicação;

import java.util.Locale;
import java.util.Scanner;

import CalcCambio.ConverteMoeda;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%");
		System.out.printf(" \t Casa de Cambio  \n");
		System.out.println("$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%$%");
		
		System.out.print("Digite a cotação do Dolar: $");
		ConverteMoeda.valorMoeda = sc.nextDouble();
		System.out.println();
		System.out.print("Quantos $ deseja comprar? R$");
		double quantidade = sc.nextDouble();
		System.out.println();
				
		double v = ConverteMoeda.converteDolar(quantidade);
		
		System.out.printf("O Valor em Reais será: R$%.2f%n", v);
		
		
		
		sc.close();
	}

}
