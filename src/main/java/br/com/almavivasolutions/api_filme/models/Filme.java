package br.com.almavivasolutions.api_filme.models;

import java.time.LocalDate;
import java.util.List;

public class Filme {

	private Integer id;
	private String nome;
	private Integer duracaoMinuto;
	private LocalDate dataLancamento;
	private Classificacao classificacao;
	private Roteiro roteiro;
	private Diretor diretor;
	private Distribuidora distribuidora;
	private List<Produtora> produtora;
	private List<Patrocinador> patrocinador;

	public Filme() {
	}

	public Filme(Integer id, String nome, Integer duracaoMinuto, LocalDate dataLancamento, Classificacao classificacao,
			Roteiro roteiro, Diretor diretor, Distribuidora distribuidora, List<Produtora> produtora,
			List<Patrocinador> patrocinador) {
		this.nome = nome;
		this.duracaoMinuto = duracaoMinuto;
		this.dataLancamento = dataLancamento;
		this.classificacao = classificacao;
		this.roteiro = roteiro;
		this.diretor = diretor;
		this.distribuidora = distribuidora;
		this.produtora = produtora;
		this.patrocinador = patrocinador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
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
