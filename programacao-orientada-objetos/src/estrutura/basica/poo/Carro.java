package estrutura.basica.poo;

//classe de exemplo sobre poo
public class Carro {

	// criando atributos para classe carro
	String cor;
	String modelo;
	int capacidadeTanque;

	// criando construtor vazio
	Carro() {

	}

	// criando o construtor com parâmetros
	Carro(String cor, String modelo, int capacidadeTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}

	// gerando get e set
	void setCor(String cor) {
		this.cor = cor;
	}

	String getCor() {
		return cor;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	String getModelo() {
		return modelo;
	}

	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	// método do valor para encher o tanque
	double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;

	}

}
