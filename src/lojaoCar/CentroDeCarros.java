package lojaoCar;

import java.util.Scanner;

public class CentroDeCarros {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			Carro carro1 = new Carro();

			System.out.println("Marca: ");

			carro1.marca = sc.nextLine();

			System.out.println("Modelo: ");

			carro1.modelo = sc.nextLine();

			System.out.println("Cor: ");

			carro1.cor = sc.nextLine();

			Carro carro2 = new Carro();

			System.out.println("Marca: ");

			carro2.marca = sc.nextLine();

			System.out.println("Modelo: ");

			carro2.modelo = sc.nextLine();

			System.out.println("Cor: ");

			carro2.cor = sc.nextLine();

			System.out.println("Carros disponíveis: \n");

			carro1.exibirInformacoes();
			carro2.exibirInformacoes();

			sc.close();
	}

}
