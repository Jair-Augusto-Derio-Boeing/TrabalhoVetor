package a;

import java.util.Arrays;

public class orgD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] orgDecrescente(int[] vetor) {

		Arrays.sort(vetor);

		System.out.println("Vetor Organizado de Forma Decrecente");

		for (int x = 9; x >= 0; x--) {

			if (x > 0) {

				System.out.print(vetor[x] + ",");

			} else {

				System.out.println(vetor[x]);

				System.out.println(" ");

			}

		}

		return vetor;

	}


}
