package a;
import java.util.Scanner;
public class menu {

	public static void main(String[] args) {

	}
	public static int menu() {
		Scanner t = new Scanner(System.in);
	while (true) {

		System.out.println("       Menu de opções");

		System.out.println("");

		System.out.println("1ª opção: coletar dados do Vetor.");

		System.out.println("2ª opção: randomizar os valores do Vetor.");

		System.out.println("3ª opção: imprime dados do Vetor.");

		System.out.println("4ª opção: imprime Vetor invertido.");

		System.out.println("5ª opção: soma valores do Vetor");

		System.out.println("6ª opção: Soma personalizada dos valores do Vetor.");

		System.out.println("7ª opção: Media dos valores do Vetor.");

		System.out.println("8ª opção: Maior valor dentro do Vetor.");

		System.out.println("9ª opção: Menor valor dentro do Vetor.");

		System.out.println("10ª opção: Para Organizar de forma Crescente");
		
		System.out.println("11ª opção: Para Organizar de forma Decrescente");

		System.out.println("Digite 0 para sair.");

		System.out.println("");

		System.out.println("Digite a opção desejada:");

		int escolha = t.nextInt();
		return escolha;
	}
	
}
}