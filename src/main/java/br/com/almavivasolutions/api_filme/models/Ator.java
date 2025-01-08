package br.com.almavivasolutions.api_filme.models;

import java.time.LocalDate;
import java.util.List;


public class Ator {
	private String nome;
	private LocalDate dataNascimento;
	private List<String> filmesAtuados;
	private Double cacheMedioPorFilme;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getCacheMedioPorFilme() {
		return cacheMedioPorFilme;
	}

	public void setCacheMedioPorFilme(Double cacheMedioPorFilme) {
		this.cacheMedioPorFilme = cacheMedioPorFilme;
	}

	public List<String> getFilmesAtuados() {
		return filmesAtuados;
	}

	public void setFilmesAtuados(List<String> filmesAtuados) {
		this.filmesAtuados = filmesAtuados;
	}
}
