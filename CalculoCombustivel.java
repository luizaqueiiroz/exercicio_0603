package exercicio0603;

import java.util.Scanner;

class CalculoCombustivel {

	public static void main(String[] args) {
		// Variáveis
		double litrogasolina, distanciaKm, consumomedio, quantlitros, custototalcomb;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados 
		System.out.println("Informe valor do litro da gasolina: ");
		litrogasolina = ler.nextDouble();

		System.out.println("Informe a distância percorrida em Km: ");
		distanciaKm = ler.nextDouble();

		System.out.println("Informe o consumo médio em Km");
		consumomedio = ler.nextDouble();

		//Processamento;
		quantlitros = distanciaKm/consumomedio;
		custototalcomb = quantlitros * litrogasolina;

		//Saída
		System.out.println("A quantidade total de litros gastos no trajeto é: " + quantlitros);
		System.out.println("O custo total com o combustível é: " + custototalcomb) ;
		ler.close();

	}

}
