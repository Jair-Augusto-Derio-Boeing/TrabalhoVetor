package a;

import java.util.Arrays;

public class org {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] orgCrescente(int[] vetor) {

		int maior = maiorValor.maiorValor(vetor);

		Arrays.sort(vetor);

		System.out.println("Vetor Organizado de Forma Crescente");

		for (int x : vetor) {

			if (x < maior) {

				System.out.print(x + ",");

			} else {

				System.out.println(x);

				System.out.println(" ");

			}

		}

		return vetor;

	}

}
