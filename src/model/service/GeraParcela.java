package model.service;

import java.util.Date;

public class GeraParcela {
	
	private GeraData data;
	private ServicoPagamento value;

	public GeraParcela(GeraData data, ServicoPagamento value) {
		this.data = data;
		this.value = value;
	}

	public Date getDate(Date data, int numeroParcela) {
		return this.data.getData(data, numeroParcela);
	}

	public Double getValue(double valorParcelado, int numeroParcela) {
		return this.value.calculaValor(valorParcelado, numeroParcela);
	}
}
