import java.util.Scanner;

public class Nota {
	/*
	 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
	 * caso o valor seja inválido e continue pedindo até que o usuário informe um
	 * valor válido.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Capturando entrada de dados através do teclado

		int nota; // variável

		System.out.println("Nota: "); // mensagem de entrada de dados
		nota = scan.nextInt();// capturando entrada de um valor inteiro.

		while (nota < 0 || nota > 10) { // Enquanto o valor da nota for menor que 0 ou maior que 10.
			System.out.println("Nota inválida! Digite outro valor: ");// Peça novamente a nota
			nota = scan.nextInt();// capturando entrada de um valor inteiro.
		}

		System.out.println("Nota: " + nota);// imprimindo a nota válida

	}

}
