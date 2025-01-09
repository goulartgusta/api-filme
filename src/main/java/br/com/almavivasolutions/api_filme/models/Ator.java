package br.com.almavivasolutions.api_filme.models;

import java.time.LocalDate;
import java.util.List;


public class Ator {
	private String nomeArtistico;
	private LocalDate dataNascimento;
	private List<String> filmesAtuados;
	private Double cacheMedioPorFilme;

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
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
