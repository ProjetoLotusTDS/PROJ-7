package atividade24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Atividade24 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();
		List<Double> lista = new ArrayList<Double>();

		double number;
		String pergunta;
		boolean condition;
		boolean condition2;
		int count = 1;
		do {

			System.out.print("Digite o numero " + count + " : ");
			number = RSN.ReceberDoubleFiltrado("Digite o numero " + count + " : ", scanner.next());
			System.out.print("Deseja continuar? (S)(N) : ");
			pergunta = scanner.next();
			pergunta = pergunta.toUpperCase();

			do {
				if (pergunta.equals("S")) {

					condition = true;
					condition2 = false;

				} else if (pergunta.equals("N")) {

					condition = false;
					condition2 = false;
				} else {
					System.out.println("Digite somente (S) ou (N)");
					System.out.print("Deseja continuar? (S)(N) : ");
					pergunta = scanner.next();
					pergunta = pergunta.toUpperCase();
					condition = true;
					condition2 = true;

				}
			} while (condition2);

			count++;
			lista.add(number);

		} while (condition);

		System.out.println();
		System.out.println("----- Resposta -----");
		int count2 = 1;
		for (Double double1 : lista) {

			if (double1 > 0) {
				System.out.println();
				System.out.println("Numero " + count2 + " (" + double1 + ")" + " é positivo");
			} else if (double1 < 0) {
				System.out.println();
				System.out.println("Numero " + count2 + " (" + double1 + ")" + " é negativo");
			} else {
				System.out.println();
				System.out.println("Numero " + count2 + " (" + double1 + ")" + " é zero");
			}
			count2++;
		}

		scanner.close();
	}

}