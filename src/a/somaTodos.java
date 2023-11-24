package a;

public class somaTodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int somaTodos(int[] vetor) {

		int soma = 0;

		for (int x = 0; x < vetor.length; x++) {

			soma = vetor[x] + soma;

		}

		System.out.println("Soma de todos os valores do vetor: " + soma);

		System.out.println(" ");

		return soma;

	}
}
