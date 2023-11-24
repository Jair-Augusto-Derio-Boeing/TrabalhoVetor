package a;

public class maiorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maiorValor(int[] vetor) {

		int maior = vetor[0];

		for (int x = 0; x < vetor.length; x++) {

			if (maior < vetor[x]) {

				maior = vetor[x];

			}

		}

		return maior;

	}
}
