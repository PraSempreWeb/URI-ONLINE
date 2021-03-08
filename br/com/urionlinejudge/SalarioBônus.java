package br.com.urionlinejudge;

import java.util.Locale;
import java.util.Scanner;

public class SalarioBônus {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeVendedor = sc.next();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		double comissao = totalVendas * 0.15;
		double salarioFinal = salarioFixo + comissao;
		
		System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);
		
	}

}
