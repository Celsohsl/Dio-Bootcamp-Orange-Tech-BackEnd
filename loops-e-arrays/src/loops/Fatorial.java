package loops;

import java.util.Scanner;

public class Fatorial {
	/*
	Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
	Ex.: 5!=5.4.3.2.1=120
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Fatorial: ");
		int fatorial = scan.nextInt();
		
		int multiplicacao = 1;
		
		System.out.print(fatorial + "! = ");
		for(int i = fatorial ; i >= 1 ; i -- ) {
			multiplicacao = multiplicacao * i;
		}
		
		System.out.println(multiplicacao);
		
		int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};

		System.out.print(numeros[2][2]);

        }


	}


