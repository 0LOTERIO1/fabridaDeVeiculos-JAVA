package fabricaVeiculos;

import br.com.combustivel.Alcool;
import br.com.combustivel.Gasolina;

public class Executavel {

	public static void main(String[] args) {
		Alcool alcool = new Alcool ();
		Gasolina gasolina = new Gasolina();
		
		Carro carro = new Carro ("volkswagen", "jetta", "verde", "151545fef", "dianteira");
		
		carro.ligar();
		carro.acelerar(202);
		carro.freiar(1);
		carro.exibirDados();
	
	}

}
