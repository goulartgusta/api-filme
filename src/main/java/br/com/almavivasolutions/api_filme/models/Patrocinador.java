package br.com.almavivasolutions.api_filme.models;

import jakarta.persistence.Table;

@Table(name = "TB_PATROCINADOR")
public class Patrocinador {
	private String nome;
	private Double valorPatrocinado;
	private String projetoPatrocinio;
	private Integer mesesPatrocinio;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorPatrocinado() {
		return valorPatrocinado;
	}

	public void setValorPatrocinado(Double valorPatrocinado) {
		this.valorPatrocinado = valorPatrocinado;
	}

	public String getProjetoPatrocinio() {
		return projetoPatrocinio;
	}

	public void setProjetoPatrocinio(String projetoPatrocinio) {
		this.projetoPatrocinio = projetoPatrocinio;
	}

	public Integer getMesesPatrocinio() {
		return mesesPatrocinio;
	}

	public void setMesesPatrocinio(Integer mesesPatrocinio) {
		this.mesesPatrocinio = mesesPatrocinio;
	}

}
