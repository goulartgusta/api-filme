package br.com.almavivasolutions.api_filme.models;

import java.util.List;

public class Proprietario {
	private String nome;
	private String paisOrigem;
	private List<Produtora> produtoras;
	private Double receitaAnual;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public List<Produtora> getProdutoras() {
		return produtoras;
	}

	public void setProdutoras(List<Produtora> produtoras) {
		this.produtoras = produtoras;
	}

	public Double getReceitaAnual() {
		return receitaAnual;
	}

	public void setReceitaAnual(Double receitaAnual) {
		this.receitaAnual = receitaAnual;
	}

}