
public class TiposVariaveis {

	public static void main(String[] args) {
		
		double salarioMinimo = 2500;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		
		int numero = 5; // exemplo de variável numero com valor 5
		
		numero = 10; // alterando o valor da variável numero com valor 10
		
		System.out.println(numero);
		
		final double VALOR_DE_PI = 3.14; // exemplo de uma variável constante, sempre em caixa alta e declarada como "final"
		
		/* são 8 tipos primitivos de variáveis em java:
		 * int, byte, short, long, float, double, boolean, char; Esses tipos 
		 * não são considerados objetos, representam valores brutos e são
		 * armazenados diretamente na pilha de memória(memory stack)
		 */

	}

}
