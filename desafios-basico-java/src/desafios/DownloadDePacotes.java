package desafios;

import java.util.Scanner;

public class DownloadDePacotes {
	// TODO: Crie a condição necessária para que, de acordo com o tamanho, seja
	// printado no console barras representando o download

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int tamanho = leitor.nextInt();
		String texto = "/";
		int i = 0;
		
		while (i < tamanho) {
			System.out.print(texto);
			i++;
		}

	}

}
