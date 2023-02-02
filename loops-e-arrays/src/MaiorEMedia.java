import java.util.Scanner;

public class MaiorEMedia {
	static /*
	 * Faça um programa que leia 5 números e informe o maior número e a média desses
	 * números.
	 */

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {// Capturando entrada de dados através do teclado

		// variáveis:
		int numero;
		int maior = 0;
		int soma = 0;

		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();// Entrada de dados, neste caso de um inteiro.

			soma = soma + numero; // some o número informado pelo usuário com variável soma (independente do
									// valor)

			if (numero > maior)// Caso o valor que o usuário digitou seja maior que o valor armazanado na
								// variável maior.
				maior = numero;// atribua o valor deste número a variável maior.
			count = count + 1; // some o valor 1 ao contador, até que invalide a condição do loop. (count < 5)

		} while (count < 5);// enquanto o contador tiver o valor menor que 5

		// imprimindo o maior número digitado e a média.
		System.out.println("O Maior é : " + maior);
		System.out.println("A Media é : " + (soma / 5));

	}

}
