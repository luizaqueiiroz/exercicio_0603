package exercicio0603;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		// Variáveis
				double a,b,som,mult,sub,div;
				//Instaciar classe Scanner
				Scanner ler = new Scanner(System.in);

				//Entrada de dados 
				System.out.println("Informe valor 1: ");
				a = ler.nextDouble();

				System.out.println("Informe valor 2: ");
				b = ler.nextDouble();

				//Processamento 
				som = a+b;
				mult = a*b;
				sub = a-b;
				div = a/b;
				//Saída
				System.out.println("O resultado da soma é : " + som);
				System.out.println("O resultado da multiplicação é : " + mult);
				System.out.println("O resultado da subtração é : " + sub);
				System.out.println("O resultado da divisão é : " + div);
				ler.close();

	}

}
