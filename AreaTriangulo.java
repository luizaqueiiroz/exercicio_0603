package exercicio0603;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// Variáveis
		double altura, base, area;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados 
		System.out.println("Informe valor da base: ");
		base = ler.nextDouble();

		System.out.println("Informe valor da altura: ");
		altura = ler.nextDouble();

		//Processamento 
		area = (base * altura) / 2;
		//Saída
		System.out.println("O valor da área do triângulo é : " + area);
		ler.close();

	}

}
