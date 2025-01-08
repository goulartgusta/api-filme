package br.com.almavivasolutions.api_filme.models;

import java.util.ArrayList;

public class Diretor {
	private String nome;
	private String Especialidade;
	private Integer anosExperiência;
	private ArrayList<String> filmesDirigidos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return Especialidade;
	}

	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}

	public Integer getAnosExperiência() {
		return anosExperiência;
	}

	public void setAnosExperiência(Integer anosExperiência) {
		this.anosExperiência = anosExperiência;
	}

	public ArrayList<String> getFilmesDirigidos() {
		return filmesDirigidos;
	}

	public void setFilmesDirigidos(ArrayList<String> filmesDirigidos) {
		this.filmesDirigidos = filmesDirigidos;
	}
}
