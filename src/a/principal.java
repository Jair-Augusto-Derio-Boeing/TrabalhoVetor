package a;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		// João Valério Santana e Jair Augusto

		Scanner t = new Scanner(System.in);

		int vetor[] = new int[10];

		int inicio = 0, termino = 0;

		while (true) {

			switch (menu.menu()) {

			case 1:

				coletaVetor.coletaVetor(vetor);

				break;

			case 2:

				int maxi = max.max();

				gerarVetorRandomico.gerarVetorRandomico(vetor, maxi);

				break;

			case 3:

				imprimeVetor.imprimeVetor(vetor);

				break;

			case 4:

				imprime.imprimeVetorInvertido(vetor);

				break;

			case 5:

				somaTodos.somaTodos(vetor);

				break;

			case 6:

				somaPer.somaPersonalizada(vetor, inicio, termino);

				break;

			case 7:

				media.media(vetor);

				break;

			case 8:

				System.out.println("O maior valor do Vetor é: " + maiorValor.maiorValor(vetor));

				System.out.println("  ");

				;

				break;

			case 9:

				menorValor.menorValor(vetor);

				break;

			case 10:

				org.orgCrescente(vetor);

				break;
			
			case 11:
				
				orgD.orgDecrescente(vetor);
				
				break;
				
			case 0:

				System.out.println("Fim do algoritimo");

				break;

			default:

				System.out.println("Opção inválida");

				break;

			}

		}

	}

}