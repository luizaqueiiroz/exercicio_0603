package exercicio0603;

import java.util.Scanner;

public class ConversaoMoedas {

	public static void main(String[] args) {
		// Variáveis
		double Real,Dolar;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados 
		System.out.println("Escreva o valor em real: ");
		Real = ler.nextDouble();

		//Processamen9to
		Dolar = Real * 0.20;


		//Saída
		System.out.println("Esse valor em dólar é $: " + Dolar);
		ler.close();


	}

}
