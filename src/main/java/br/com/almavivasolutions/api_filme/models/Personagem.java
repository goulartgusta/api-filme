package br.com.almavivasolutions.api_filme.models;

import java.util.List;

public class Personagem {
	private String nome;
	private String papel;
	private String genero;
	private List<Ator> ator;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Ator> getAtor() {
		return ator;
	}

	public void setAtor(List<Ator> ator) {
		this.ator = ator;
	}
}
