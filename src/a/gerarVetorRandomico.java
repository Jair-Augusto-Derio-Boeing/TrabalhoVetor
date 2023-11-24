package a;

import java.util.Random;

public class gerarVetorRandomico {

	public static void main(String[] args) {
		int[] vetor = new int[10];
//		int maximo = max.max();
		
	}
	public static int[] gerarVetorRandomico(int[] vetor, int max) {

		Random ale = new Random();

		System.out.print("Valores randômicos gerados: ");

		for (int x = 0; x < vetor.length; x++) {

			vetor[x] = ale.nextInt(max);

			if (x < vetor.length - 1) {

				System.out.print(vetor[x] + ",");

			} else {

				System.out.println(vetor[x]);

				System.out.println(" ");

			}

		}

		return vetor;

	}

}
