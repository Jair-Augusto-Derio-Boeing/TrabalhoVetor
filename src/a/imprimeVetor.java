package a;

public class imprimeVetor {

	public static void main(String[] args) {
	}
	
		public static void imprimeVetor(int[] vetor) {

			System.out.println("Dados do vetor: ");

			for (int x = 0; x < 10; x++) {

				if (x < vetor.length - 1) {

					System.out.print(vetor[x] + ",");

				} else {

					System.out.println(vetor[x]);

					System.out.println(" ");

				}

			}

		
	}

}

