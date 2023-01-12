package operadores;

public class Operadores {

	public static void main(String[] args) {
		
		/* Operador de atribuição, representado pelo símbolo =
		 * é utilizado para definir o valor inicial de uma variável ou
		 * sobrescrever o seu valor. 
		 */
		String nome = "Jonas";
		int idade = 30;
		double peso = 76.8;
		char sexo = 'M';
		boolean doadorOrgao = false;
		Date dataNascimento = new Date();
//-------------------------------------------------------------------------------------
		/* Operadores aritméticos, são representados pelos símbolos +(adição),
		 * -(subtração), *(multiplicação) e /(divisão)
		 * é utilizado para realizar operações matemáticas entre valores numéricos,
		 * podendo se tornar ou não uma expressão mais complexa. 
		 */
		
		double soma = 10.5 + 17.8;
		int subtracao = 113 - 30;
		int multiplicacao = 20 * 13;
		int divisao = 20 / 4;
		int modulo = 18 % 3;
		double resultado = (20 * 13) + (20 / 4);
		
		/* o operador de adição(+), quando utilizado em vaiáveis do tipo texto,
		 * realizará a concatenação de textos, ou seja vai juntar uma palavra a outra.
		 */
		String nomeCompleto = "Linguagem" + "Java";
//-----------------------------------------------------------------------------------------
		/* Operadores Unários, é aplicado juntamente com um operador aritmético, eles
		 * realizam tebalhos basicos como incrementar decrementar, inverter valores 
		 * numéricos e booleanos.
		 * + operador unário de valor positivo, números são positivos sem esse operador.
		 * - operador unário de valor negativo, nega um número ou expressão aritmética.
		 * ++ operador unário de incremento de valor, incrementa o valor em 1 unidade.
		 * -- operador unário de decremento de valor, decrementa o valor em 1 unidade.
		 * ! operador unário lógico de negação, nega o valor de uma expressão booleana.
		 */
		
		int numero = 5;
		
		numero = - numero;
		
//		System.out.println(- numero);
		
		numero = + numero;
		
//		System.out.println(numero);
		
		numero = numero * -1;
		
		System.out.println(numero);
		
	}

}
