package br.com.almavivasolutions.api_filme.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Table;

@Table(name = "TB_DISTRIBUIDORA")
public class Distribuidora {
	private String nome;
	private List<String> filmesDistribuidos;
	private LocalDate anoFundacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getFilmesDistribuidos() {
		return filmesDistribuidos;
	}

	public void setFilmesDistribuidos(List<String> filmesDistribuidos) {
		this.filmesDistribuidos = filmesDistribuidos;
	}

	public LocalDate getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(LocalDate anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

}
