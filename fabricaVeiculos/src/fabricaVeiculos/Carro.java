package fabricaVeiculos;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollBarUI;

import br.com.combustivel.Combustivel;


public class Carro extends Veiculo {

	
	
	public Carro(String marca, String modelo, String cor, String placa,String tracao) {
		super(marca, modelo, cor, placa);
		
				
	}

	//METODO DE ABRIR PORTA MALAS E FECHAR --> 
		
	public void abrirPortaMala() {
		boolean aberto = true;
		if (!aberto) {
			System.out.println("Porta malas aberto");
		}else {
			aberto = false;
			
		}
		
	}
	
	//metodo para fechar porta --> 
	
	public void fecharPortaMala() {
		boolean fechado = true;
		
		if (!fechado) {
			System.out.println("porta malas fechado");
		}else {
			fechado = false;
			
		}
	}
	
	//metodo de carregar carro --> 
	
	public void carregarCarro( int qtdProduto) {
		
		if (estaLigado ) {
			if ( qtdProduto <= 10) {
				System.out.println(" Ajeitando as compras no porta malas ");
			} else {
				System.out.println("Nao tem espaco no porta malas");
			}
		}else {
			System.out.println("Porta malas fechado");
		}
	
	}
	
	public void tipoCarro(double cavalos) {
		if (cavalos >= 400 ) {
			System.out.println(" Carros de luxo  ");
		} else if (cavalos >=200 && cavalos < 400) {
			System.out.println(" Carros esportivos ");
		} else {
			System.out.println(" Carros Básicos ");
		}	
	}
	
	
	
	}
