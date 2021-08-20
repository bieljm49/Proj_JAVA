package CalcCambio;

public class ConverteMoeda {
	public static double valorMoeda;
	public static final double IOF = 0.011; // valor do exercicio 0.06
	
	public static double converteDolar(double quantidade) {
		double rest = (quantidade * valorMoeda ) ;
		double vFinal = (rest * IOF) + rest;
		double vIof = rest * IOF;
		
		System.out.printf("O Valor sem IOF atribuído: R$%.2f%n", rest);
		System.out.printf("O Valor referente a porcentagem IOF é: R$%.2f%n", vIof);
		
		return vFinal;
	}
}
