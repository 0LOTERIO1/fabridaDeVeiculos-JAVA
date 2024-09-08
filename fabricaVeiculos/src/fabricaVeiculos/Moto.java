package fabricaVeiculos;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class Moto extends Veiculo{

	public Moto(String marca, String modelo, String cor, String placa, double cilindrada,  int qtdCilindro) {
		super(marca, modelo, cor, placa);
		
	}

	
	public void cortarGiro () {
		System.out.println(" RAN DAN DAN DAN DAN DAN POWWWW POWWWW ");
	}
	
	public void carregarMoto (int qtdBau) {
		switch (qtdBau) {
		case 1: {
			System.out.println(" Capacidade maxima do Baú : 10 Kg ");
			break;
		}
		case 2: {
			System.out.println(" Capacidade maxima dos dois baús : 20 Kg ");
			break;
			}
		case 3: {
			System.out.println(" Para cada baú o maximo de Kg é de 10, totalizando 30  ");
			System.out.println(" *** Nao execeder o limite ***");
			break;
		}
		default :
			System.out.println(" Quantidade acima do limite, somente 3 baús para baixo ");
		}
	}
	
	
	public void colocarCapacete () {
		boolean capacete = false;
		
		if (!capacete) {
			System.out.println(" colocando capacete  ");
			System.out.println(" Capacete colocado ");
		}
		else {
			capacete = true;
		}
	}
	
	public void tirarCapacete () {
		boolean capacete = false;
		if (!capacete) {
			System.out.println(" Tirando o capacete ");
			System.out.println(" Capacete retirado");
		}
	}
	
}
