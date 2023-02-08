package heranca.associacao.polimorfismo;

public class RodarAplicacao {

	public static void main(String[] args) {

		Mae[] classes = new Mae[] { new ClasseFilha1(), new ClasseFilha2(), new Mae()

		};

		for (Mae classe : classes) {
			classe.metodo1();
		}

		System.out.println("");

		for (Mae classe : classes) {
			classe.metodo2();
		}

		System.out.println("");

		ClasseFilha2 classeFilha2 = new ClasseFilha2();
		classeFilha2.metodo2();

	}

}
