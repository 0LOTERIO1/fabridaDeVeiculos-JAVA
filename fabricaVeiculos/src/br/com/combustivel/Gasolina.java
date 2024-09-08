package br.com.combustivel;

public class Gasolina implements Combustivel{

	@Override
	public double abastecer(double valor) {
		double rendimento = valor * 10;
		return rendimento;
	}

}
