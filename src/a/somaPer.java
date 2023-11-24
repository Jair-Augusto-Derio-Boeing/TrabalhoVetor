package a;

import java.util.Scanner;

public class somaPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int somaPersonalizada(int[] vetor, int inicio, int termino) {

		Scanner t = new Scanner(System.in);

		int soma = 0;

		System.out.println("Indíce de início(inclusive):");

		inicio = t.nextInt();

		System.out.println("Indíce de término(inclusive):");

		termino = t.nextInt();

		if (inicio <= vetor.length && termino <= vetor.length) {

			if (inicio < termino) {

				for (int x = inicio; x <= termino; x++) {

					soma = soma + vetor[x];

				}

				System.out.println("Soma personalizada: " + soma);

				System.out.println("  ");

			} else {

				System.out.println("Verifique restrições do Algoritimo!");

				System.out.println("  ");

			}

		} else {

			System.out.println("Verifique restrições do Algoritimo!");

			System.out.println(" ");

		}

		return soma;

	}
}
