package desafios;

import java.util.Scanner;

public class IndustriaDaMulta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int velocidadeAtual = scan.nextInt();
		
		if(velocidadeAtual <= 60) {
			System.out.print("Nao foi multado");
		} else {
			System.out.print("Foi multado");
		}

	}

}
