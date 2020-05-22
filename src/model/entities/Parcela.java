package model.entities;

import java.util.Date;

public class Parcela {
	private Date data;
	private Double parcela;

	public Parcela(Date data, Double parcela) {
		this.data = data;
		this.parcela = parcela;
	}

	public Date getData() {
		return data;
	}

	public Double getParcela() {
		return parcela;
	}
}
