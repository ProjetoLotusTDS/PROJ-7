package atividade24;

import java.util.Scanner;

public class ReceberSomenteNumero {

	public double ReceberDoubleFiltrado(String frase, String numero) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		double numeroDouble = 0;
		boolean condition = true;
		do {

			try {
				if (numero.contains(",")) {
					numero = numero.replace(",", ".");
				}
				numeroDouble = Double.valueOf(numero);
				condition = false;
			} catch (Exception e) {
				System.out.println("Isso não é um número né po?");
				System.out.print(frase);
				numero = scanner.nextLine();
			}

		} while (condition);

		return numeroDouble;

	}
	
	public int ReceberIntFiltrado(String frase, String numero) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int numeroInteger = 0;
		boolean condition = true;
		do {

			try {
				numeroInteger = Integer.valueOf(numero);
				condition = false;
			} catch (Exception e) {
				System.out.println("Isso não é um número né po?");
				System.out.print(frase);
				numero = scanner.nextLine();
			}

		} while (condition);
		
		
		return numeroInteger;
	}

}