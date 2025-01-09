package br.com.almavivasolutions.api_filme.models;

import java.util.List;

import jakarta.persistence.Table;

@Table(name = "TB_PRODUTORA")
public class Produtora {
	private String nome;
	private String paisOrigem;
	private List<String> filmesProduzidos;
	private Double receitaAnual;
	private Proprietario proprietario;

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

	public List<String> getFilmesProduzidos() {
		return filmesProduzidos;
	}

	public void setFilmesProduzidos(List<String> filmesProduzidos) {
		this.filmesProduzidos = filmesProduzidos;
	}

	public Double getReceitaAnual() {
		return receitaAnual;
	}

	public void setReceitaAnual(Double receitaAnual) {
		this.receitaAnual = receitaAnual;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
}
