
public class ControleFluxo {

	//Classe de exemplo sobre, controle de fluxo e blocos.
	
	public static void main(String[] args) {
		
		ifFlecha();
		ifSemFlecha();
		ifFerias();
		ifMenor();
		
		switchSemana();
		switchNumeros();
		switchFerias();
		
	}
	//Exemplo do uso de muitos if, else que deve ser evitado, pois causa o efeito flecha.  
	private static void ifFlecha() {
		
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else {
			if (mes == 2) {
				System.out.println("Fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("Março");
				} else {
					if (mes == 4) {
						System.out.println("Abril");
					} else {
						if (mes == 5) {
							System.out.println("Maio");
						} else {
							if (mes == 6) {
								System.out.println("Junho");
							} else {
								if (mes == 7) {
									System.out.println("Julho");
								} else {
									if (mes == 8) {
										System.out.println("Agosto");
									} else {
										if (mes == 9) {
											System.out.println("Setembro");
										} else {
											if (mes == 10) {
												System.out.println("Outubro");
											} else {
												if (mes == 11) {
													System.out.println("Novembro");
												} else {
													if (mes == 12) {
														System.out.println("Dezembro");
													}
													
													else {
														System.out.println("Mês indefinido");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	//Exemplo do uso de else if em única linha, mantendo o código alinhado a esquerda, evitando o efeito flecha.
	private static void ifSemFlecha() {
		
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
		    System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Mês indefinido");																					
		}
		
	}
	
	//Uso indevido do if, neste método existe uma única variável envolvida no if, o correto seria o switch.   
	private static void ifFerias() {
		
		String mes = "julho";
		if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
			System.out.println("Férias");
		}
		
	}
	
	//Exemplo de melhoramento no uso de váriavel e if.
	private static void ifMenor() {
		
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcionário deve receber auxílio");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if ((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcionário deve receber auxílio");
		}
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		if (recebeAuxilio) {
			System.out.println("Funcionário deve receber auxílio");
		} else {
			System.out.println("Funcionário não deve receber auxílio" );
		}
		
	}
	
	//Exemplo deste método, com switch para o valor de uma única variável.
	private static void switchSemana() {
		
		String dia = "Terça";
		switch (dia) {
		case "Segunda":
			System.out.println(2);
			break;
		case "Terça":
			System.out.println(3);
			break;
		case "Quarta":
			System.out.println(4);
			break;
		case "Quinta":
			System.out.println(5);
			break;
		case "Sexta":
			System.out.println(6);
			break;
		case "Sábado":
			System.out.println(7);
			break;
		case "Domingo":
			System.out.println(1);
			break;
		default:
//			System.out.println(1);
			System.out.println("Dia inválido");
			break;
		}
	}
	
	//Exemplo deste método, com switch para obter uma resposta com mais de um valor.
	private static void switchNumeros() {
		
		int numero = 4;
		switch (numero) {
			case 1:
			case 2:
			case 3:
				System.out.println("Certo");
				break;
			case 4:
				System.out.println("Errado");
				break;
			case 5:
				System.out.println("Talvez");
				break;
			default:
				System.out.println("Valor indefinido");
				break;
				
		}
	}
	
	//Exemplo deste método, com switch para strings.
	private static void switchFerias() {
		
		String mes = "Dezembro";
		switch (mes) {
		case "Dezembro":
		case "Julho":
		case "Janeiro":
			System.out.println("Férias");
			break;
		default:
			System.out.println("Mês indefinido");
			break;
		}
	}
}


