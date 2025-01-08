package br.com.almavivasolutions.api_filme.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ator {
	private String nome;
	private Date datNascimento;
	private List<String> filmesAtuados;
	private Double cacheMedioPorFilme;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return datNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.datNascimento = dataNascimento;
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

	public void setFilmesAtuados(ArrayList<String> filmesAtuados) {
		this.filmesAtuados = filmesAtuados;
	}
}
