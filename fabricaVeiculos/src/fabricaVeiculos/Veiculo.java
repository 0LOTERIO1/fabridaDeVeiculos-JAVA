package fabricaVeiculos;

import java.util.Date;

import br.com.combustivel.Combustivel;

//classe mãe-->> 
public abstract class Veiculo { // nao deixa instanciar um objeto veiculo

	// ATRIBUTOS -->

	protected String marca, modelo;
	protected String cor, placa;
	protected Date anoFabricacao;
	protected boolean estaLigado;
	protected double velocidade;
	
	
	

	// METODO CONSTRUTOR -->

	public Veiculo(String marca, String modelo, String cor, String placa) {

		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.anoFabricacao = new Date(); // aqui vamos fornecer no objeto
		this.estaLigado = false;
		
	}

	// metodos -->

	// PRIEMIRO METODO -->

	public void ligar() {
		if (estaLigado) {
			System.out.println("Veiculo Ligado ");
		} else {
			estaLigado = true;
		}
	}

	// SEGUNDO METODO -->
	public void desligar() {
		if (!estaLigado) {
			System.out.println("Veiculo desligado ");

		} else {
			estaLigado = false;
		}
	}

	// TERCEIRO METODO -->
	public void acelerar(double valor) {
		if (this.estaLigado) {
			velocidade += valor;
			if (this.velocidade + valor <= 200) {
	            this.velocidade += valor;
	        } else {
	            this.velocidade = 200; 
	            System.out.println("Velocidade máxima atingida: 200 por hora");
	        }
		} else {
			this.ligar();
			this.acelerar(valor);// recursividade
		}
	}
	// QUARTO METODO -->

	public void freiar(double valor) {
		if (estaLigado) {
			this.velocidade -= valor;
			if (this.velocidade + valor >= 0) {
				if (velocidade < 0) {
					this.velocidade = 0;
				}
			}

		}

	}

	// QUINTO METODO -->
	public void exibirDados() {

		System.out.println(" Velocidade : " + this.velocidade);
		System.out.println("Cor " + this.cor);
		

	}
	// METODO DE ABASTECIMENTO, DOS CARROS USANDO INTERFACE PATTERN DESIGNER --> 
	
	private double rendimento;

	public void abastecer(double valor, Combustivel combustivel) {
		if (valor <= 50) {

			rendimento = combustivel.abastecer(valor);
			System.out.println(" O rendimento é de " + rendimento + " Km \n");
		} else {
			System.out.println("  *** ERRO *** \n Ultrapassou o limite de abastecimento \n");
		}

	}

}
