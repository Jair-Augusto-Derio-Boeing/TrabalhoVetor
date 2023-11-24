package a;

public class media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static double media(int[] vetor) {

		double soma = 0;

		for (int x = 0; x < vetor.length; x++) {

			soma = vetor[x] + soma;

		}

		double media = soma / 10;

		System.out.println("A média do Vetor é " + media);

		System.out.println(" ");

		return soma;

	}


}
