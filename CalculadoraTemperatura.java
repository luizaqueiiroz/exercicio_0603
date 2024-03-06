package exercicio0603;

import java.util.Scanner;

public class CalculadoraTemperatura {

	public static void main(String[] args) {

		// Variáveis
		double Fahrenheit,Celsius;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados 
		System.out.println("Escreva a temperatura em Fahrenheit: ");
		Fahrenheit = ler.nextDouble();

		//Processamento
		Celsius = ((Fahrenheit - 32) * 5) / 9;


		//Saída
		System.out.println("A temperatura em Celsius é: " + Celsius);
		ler.close();

	}

}
