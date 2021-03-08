package br.com.urionlinejudge;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int numeroPecas = sc.nextInt();
		double valorUnitario = sc.nextDouble();
		
		int codigo1 = sc.nextInt();
		int numeroPecas1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		
		double valorPagar = numeroPecas * valorUnitario;
		double valorpagar1 = numeroPecas1 * valorUnitario1;
		double ValorTotal = valorPagar + valorpagar1;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", ValorTotal);
		
		sc.close();
	}

}
