package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.service.GeraData;
import model.service.GeraParcela;
import model.service.PaypalServicoPagamento;

public class Contrato {

	private Integer numero;
	private Date data;
	private Double valorContrato;
	private Integer qtdParcelas;

	private final GeraParcela gp = new GeraParcela(new GeraData(), new PaypalServicoPagamento());
	private List<Parcela> parcela = new ArrayList<>();

	public Contrato(Integer numero, Date data, Double valorContrato, Integer qtdParcelas) {
		this.numero = numero;
		this.data = data;
		this.valorContrato = valorContrato;
		this.qtdParcelas = qtdParcelas;

		this.criaParcelas();
	}

	public Integer getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public Integer getQtdParcelas() {
		return qtdParcelas;
	}

	public List<Parcela> getParcelas() {
		return parcela;
	}

	public void criaParcelas() {
		double valorParcela = this.valorContrato / this.qtdParcelas;

		for (int x = 1; x <= this.qtdParcelas; x++) {
			parcela.add(new Parcela(gp.getDate(this.data, x), gp.getValue(valorParcela, x)));
		}
		
		if(this.qtdParcelas == 0)
		parcela.add(new Parcela(gp.getDate(this.data, 0), gp.getValue(this.valorContrato, 0)));
	}
}