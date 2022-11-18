/*
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
 * para ser responsável pelos cálculos.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter x = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		x.price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		x.amount = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", x.priceInReais());
		
		
		sc.close();
	}

}
