package br.com.almavivasolutions.api_filme.models;

public class Patrocinador {
	private String nome;
	private Double valorPatrocinio;
	private String projetoPatrocinio;
	private Integer mesesPatrocinio;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorPatrocinio() {
		return valorPatrocinio;
	}

	public void setValorPatrocinio(Double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
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
