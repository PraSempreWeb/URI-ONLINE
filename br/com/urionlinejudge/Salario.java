package br.com.urionlinejudge;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horastrabalhadas = sc.nextInt();
		double Vhoras = sc.nextDouble();
		
		double salario = horastrabalhadas * Vhoras;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);		
		
		sc.close();
	}
}
