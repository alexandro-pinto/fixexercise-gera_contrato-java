package model.service;

public class PaypalServicoPagamento implements ServicoPagamento{
	public double calculaValor(Double valor, Integer numParcela) {
		if(numParcela == 0)
			return valor;
		
		double soma = valor * 0.01 * numParcela + valor; 
		return  soma * 0.02 + soma ;
	}
}
