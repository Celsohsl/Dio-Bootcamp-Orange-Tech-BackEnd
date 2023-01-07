package estudo.sintaxejava.anatomiaclasse;
// Ao criar uma classe, todas as primeiras Letras das palavras devem iniciar em Maiusculas.

public class MinhaClasse {

	// Declaração inválida de variáveis:
	int numero&um=1; // os unicos simbolos permitidos são: _ e $.
	int 1 numero=1; // uma variável não pode começar com números.
	int numero um=1; // não pode haver espaços no nome de uma variável.
	int long=1; // long faz parte da palavra reservada da linguagem.

	// Declaração válida de variáveis:
	int numero$um = 1;
	int numero1 = 1;
	int numeroum = 1;
	int longo = 1;
//------------------------------------------------------------------------------------------------		
	// Declarando uma variável

	// Estrutura
	Tipo NomeBemDefinido = Atribuição (Opcional em alguns casos)
		
		// Exemplo
		int idade = 23;
		double altura = 1.71;
		Dog spike; // aqui a variável spike não tem um valor.
		String meuNome = "Paulo"; // variável do tipo texto
		int anoFabricação = 2000; // variável do tipo inteiro
		boolean verdadeira = false; // variável do tipo lógico
		anoFabricação = 2018; // alterando o valor de uma variável existente.
//-------------------------------------------------------------------------------------------------
	// Declarando um método

	// Estrutura
	TipoRetorno NomeObjetivoNoInfinitivo Parametros(s)
		
	// Exemplos
	int somar (int numero1, int numero2) // um método pode ter mais de um parâmetro.

	String formatarCep (long cep) // ele pode ser de um tipo, e ter parâmetro de tipo diferente.
//---------------------------------------------------------------------------------------------------

	public static void main(String[] args) {

		// Variáveis para o método nomeCompleto
		String primeiroNome = "João";
		String segundoNome = "Mendes";

		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

		System.out.println(nomeCompleto);
	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {

		return "Resultado do método criado: " + primeiroNome.concat(" ").concat(segundoNome);
	}

}
