package br.com.almavivasolutions.api_filme.models;

import java.util.List;

public class Roteiro {
	private String titulo;
	private String enredo;
	private String tema;
	private String contextoHistorico;
	private List<Personagem> personagens;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEnredo() {
		return enredo;
	}

	public void setEnredo(String enredo) {
		this.enredo = enredo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getContextoHistorico() {
		return contextoHistorico;
	}

	public void setContextoHistorico(String contextoHistorico) {
		this.contextoHistorico = contextoHistorico;
	}

	public List<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(List<Personagem> personagens) {
		this.personagens = personagens;
	}
}