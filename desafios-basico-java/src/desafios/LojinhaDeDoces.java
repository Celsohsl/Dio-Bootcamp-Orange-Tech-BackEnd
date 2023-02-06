package desafios;

import java.util.Scanner;

public class LojinhaDeDoces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int doce = scan.nextInt();
		int quantidadeDoce = 0;
		
		quantidadeDoce = doce * 2;
		
		System.out.println("O cliente obteve " + quantidadeDoce + " doces");

	}

}
