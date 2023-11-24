package a;

public class imprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void imprimeVetorInvertido(int[] vetor) {

		System.out.print("Dados do Vetor: ");

		for (int x = 1; x <= vetor.length; x++) {

			if (x <= vetor.length - 1) {

				System.out.print(vetor[vetor.length - x] + ",");

			} else {

				System.out.print(vetor[vetor.length - x]);

				System.out.println(" ");

			}

		}

	}

}
