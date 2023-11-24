package a;

import java.util.Scanner;

public class coletaVetor {

	public static void main(String[] args) {
		int[] vetor = new int[10];
	}

	public static int[] coletaVetor(int[] vetor) {

		Scanner t = new Scanner(System.in);

		for (int cont = 0; cont < 10; cont++) {

			System.out.println("Informe o " + (cont + 1) + "º Valor do Vetor");

			vetor[cont] = t.nextInt();

		}

		return vetor;

	}

}
