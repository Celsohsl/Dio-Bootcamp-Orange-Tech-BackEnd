package arrays;

public class OrdemInversa {
	/*
	Crie um vetor de 6 números inteiros
	e mostre-os na ordem inversa.
	*/
	
	public static void main(String[] args) {
		
		int[] vetor = { 0, -5, 15, 50, 8, 40};
		
		System.out.println("Vetor: ");
		int count = 0;
		while(count < (vetor.length)) {
			System.out.print(vetor[count] + " ");
			count++;
			
		}
		
		System.out.println("\nVetor: ");
		for(int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}

	}

}
