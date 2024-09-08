package fabricaVeiculos;

public class Caminhao extends Veiculo {

	public Caminhao(String marca, String modelo, String cor, String placa) {
		super(marca, modelo, cor, placa);

	}

	//metodo para saber a capacidade do caminhao pelos eixos --> 
	public void capacidade(int qtdEixo) {

		if (qtdEixo == 5 ) {
			System.out.println("Pode suportar aproximadamente de 20 a 30 toneladas ( 20000 - 30000 Kg) ");
		} else if (qtdEixo > 2 && qtdEixo <= 4) {
			System.out.println("Pode suportar aproximadamente de 10 a 20 toneladas ( 10000 - 20000 Kg)");
		} else if (qtdEixo <=2 && qtdEixo>0) {
			System.out.println(" Pode suportar aproximandamente 6 toneladas ( 6000 Kg ) ");
		} else if (qtdEixo == 0) {
			System.out.println(" Pode suportar aproximadamente 3 toneladas ( 3000 Kg )");
		}else {
			System.out.println("Limite de eixo excedido ou nao existe eixo ");
		}
	}

	
	//metodo buzina --> 
	public void buzinar() {
		System.out.println("\n FUMMMMMMMMMMMMMMM FUMMMMMMMMMMMMMMMMMMMM ");
	}

	
	//metodo de carregar o caminhao pela qtd de eixo --> 
	
	public void carregarCaminhao(int qtdEixo) {
		int container = 0 ;
		
		switch (qtdEixo) {
		case 0: {
			System.out.println(" Não existe carregamento de container");
			break;
		}
		
		case 1: {
			container = qtdEixo;
			System.out.println(" Para cada " + qtdEixo+ " eixo(s). Pode-se carregar o caminhao com " + container + " container(s). ");
			break;
		}
		
		case 2: {
			container = qtdEixo;
			System.out.println(" Para cada " + qtdEixo+ " eixo(s). Pode-se carregar o caminhao com " + container + " container(s). ");
			break;
		}
		
		case 3: {
			container = qtdEixo;
			System.out.println(" Para cada " + qtdEixo+ " eixo(s). Pode-se carregar o caminhao com " + container + " container(s). ");
			break;
		}
		
		case 4: {
			container = qtdEixo;
			System.out.println(" Para cada " + qtdEixo+ " eixo(s). Pode-se carregar o caminhao com " + container + " container(s). ");
			break;
		}
		
		case 5: {
			container = qtdEixo;
			System.out.println(" Para cada " + qtdEixo+ " eixo(s). Pode-se carregar o caminhao com " + container + " container(s). ");
			break;
		}
		
		default: {
			
			System.out.println(" Não existe carregamento de container  ");
			break;
		}
		
		}
	}
	
	// fim 
	
}