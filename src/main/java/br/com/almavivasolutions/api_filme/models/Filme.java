package br.com.almavivasolutions.api_filme.models;

import java.util.Date;
import java.util.List;

public class Filme {
	private String nome;
	private Integer duracaoMinuto;
	private Date dataLancamento;
	private Classificacao classificacao;
	private Roteiro roteiro;
	private Diretor diretor;
	private Distribuidora distribuidora;
	private List<Produtora> produtora;
	private List<Patrocinador> patrocinador;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDuracaoMinuto() {
		return duracaoMinuto;
	}

	public void setDuracaoMinuto(Integer duracaoMinuto) {
		this.duracaoMinuto = duracaoMinuto;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Classificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}

	public Roteiro getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(Roteiro roteiro) {
		this.roteiro = roteiro;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public Distribuidora getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(Distribuidora distribuidora) {
		this.distribuidora = distribuidora;
	}

	public List<Produtora> getProdutora() {
		return produtora;
	}

	public void setProdutora(List<Produtora> produtora) {
		this.produtora = produtora;
	}

	public List<Patrocinador> getPatrocinador() {
		return patrocinador;
	}

	public void setPatrocinador(List<Patrocinador> patrocinador) {
		this.patrocinador = patrocinador;
	}

}
