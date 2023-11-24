package a;

public class menorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int menorValor(int[] vetor) {

		int menor = vetor[0];

		for (int x = 0; x < vetor.length; x++) {

			if (menor > vetor[x]) {

				menor = vetor[x];

			}

		}

		System.out.println("O menor valor do Vetor é: " + menor);

		System.out.println(" ");

		return menor;

	}
}
