package estrutura.basica.poo;

public class ExecutarCarro {

	public static void main(String[] args) {
		
		// usando get e set
		Carro carro1 = new Carro();

		carro1.setCor("Azul");
		carro1.setModelo("BMW serie 3");
		carro1.setCapacidadeTanque(59);

		System.out.println("Carro1");
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorTanque(6.39));
		

		// passando os parâmetros diretamente no construtor
		Carro carro2 = new Carro("Cinza", "Mercedez-Benz Calsse C ", 66);
		
		System.out.println("Carro 2");
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(6.46));

	}

}
