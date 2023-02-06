package desafios;

import java.util.Scanner;

public class LeituraDaGertrudes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int paginas = scan.nextInt();
		int paginasLidas = 3;
		
		System.out.println((paginas / paginasLidas) + " dias");

	}

}
