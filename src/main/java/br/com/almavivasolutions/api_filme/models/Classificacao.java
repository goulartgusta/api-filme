package br.com.almavivasolutions.api_filme.models;

import jakarta.persistence.Table;

@Table(name = "TB_CLASSIFICACAO")
public class Classificacao {
	private String paisOrigem;
	private String nomeClassificacao;
	private String descricao;

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getNomeClassificacao() {
		return nomeClassificacao;
	}

	public void setNomeClassificacao(String nomeClassificacao) {
		this.nomeClassificacao = nomeClassificacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
