package br.com.almavivasolutions.api_filme.models;

import java.util.List;

public class Distribuidora {
	private String nome;
	private List<String> filmesDistribuidos;
	private Integer anoDeFundacao;

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

	public Integer getAnoDeFundacao() {
		return anoDeFundacao;
	}

	public void setAnoDeFundacao(Integer anoDeFundacao) {
		this.anoDeFundacao = anoDeFundacao;
	}

}
