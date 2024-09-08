package br.com.combustivel;

public class Alcool implements Combustivel{

	@Override
	public double abastecer(double valor) {
		double rendimento = valor * 7.5;
		return rendimento;
	}

}
