package operadores;

public class Operadores {

	public static void main(String[] args) {
		
		/* Atribuição, representado pelo símbolo =
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
		/* Aritméticos, são representados pelos símbolos: +(adição),
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
		
		/* O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
		 */
		String nomeCompleto = "Linguagem" + "Java";
		
//-----------------------------------------------------------------------------------------
		/* Operadores Unários, é aplicado juntamente com um operador aritmético, eles
		 * realizam trabalhos basicos como incrementar decrementar, inverter valores 
		 * numéricos e booleanos.
		 * + operador unário de valor positivo, números são positivos sem esse operador.
		 * - operador unário de valor negativo, nega um número ou expressão aritmética.
		 * ++ operador unário de incremento de valor, incrementa o valor em 1 unidade.
		 * -- operador unário de decremento de valor, decrementa o valor em 1 unidade.
		 * ! operador unário lógico de negação, nega o valor de uma expressão booleana.
		 */
		
		
		int numero = 5;
		
		numero = - numero;
		
		//Imprimindo o numero negativo
		System.out.println(- numero);
		
		//incrementando numero em mais 1 numero, imprime 6
		numero ++;
		System.out.println(numero);
		
		//incrementando numero em mais 1 numero, imprime 7
		System.out.println(numero ++);// errado não está certo
		
		System.out.println(numero);// agora sim, numero virou 7
		
		//ordem de precedencia conta aqui
		System.out.println(++numero);
		
		boolean verdadeiro = true;
		
		System.out.println("Inverteu " + !verdadeiro);
		
//-----------------------------------------------------------------------------------------
		/*O operador ternário é representado pelos símbolos "?" e ":" 
		 * utilizados na seguinte estrutura de sintaxe:
		 * <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
		 */
		
		int a, b;
		
		a = 5;
		b = 6;
		
		String resultado = "";
		if(a==b);
			resultado = "verdadeiro";
		else
			resultado = "falso";
		
		System.out.println(resultadoDois);
		
		//Utilizando o operador condicional ternário.
		
		String resultadoDois = a == b ? "verdadeiro" : "falso";
		
		System.out.println(resultadoDois);
		
//-----------------------------------------------------------------------------------------
		/*Relacionais, avaliam a relação entre duas variáveis ou expressões.
		 * == Quando desejamos verificar se uma variável é IGUAL A outra.
		 * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
		 * > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
		 * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
		 * < Quando desejamos verificar se uma variável é MENOR QUE outra.
		 * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
		*/
		String nomeUm = "Java";
		String nomeDois = new String ("Java");
		
		//Utlizando equals para comparar objetos
		System.out.println(nomeUm.equals(nomeDois));
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
		simNao = numero1 != numero2;
		
		System.out.println("numeroUm é diferente de numeroDois? " + simNao);
		
		simNao = numero1 > numero2;
		
		System.out.println("numeroUm é maior que numeroDois? " + simNao);
		
//-----------------------------------------------------------------------------------------
		/*Operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, 
		 * a partir da junção de duas ou mais expressões.
		 * Operador lógico && "E"
		 * Operador lógico || "Ou"
		 */
		
		boolean condicao1 = true;
		boolean condicao2 = true;
		
		if(condicao1 && (7 > 4)) {
			System.out.println("as duas condicões são verdadeiras");
		}
		
		if(condicao1 || condicao2) {
			System.out.println("Uma das condicões é verdadeira");
		}
		
		System.out.println("fim");
	}

}
