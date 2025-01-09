package br.com.almavivasolutions.api_filme.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "TB_FILME")
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PK_FILME")
	private Integer id;
	
	@NotNull
	@Column(name = "NOME")
	private String nome;
	
	@NotNull
	@Column(name = "DURACAO_MINUTO")
	private Integer duracaoMinuto;
	
	@NotNull
	@Column(name = "DATA_LANCAMENTO")
	private LocalDate dataLancamento;
	
	@OneToOne
	@JoinColumn(name = "FK_CLASSIFICACAO")
	private Classificacao classificacao;
	
	@OneToOne
	@JoinColumn(name = "FK_ROTEIRO")
	private Roteiro roteiro;
	
	@OneToOne
	@JoinColumn(name = "FK_DIRETOR")
	private Diretor diretor;
	
	@ManyToMany
	@JoinColumn(name = "FK_DISTRIBUIDORA")
	private List<Distribuidora> distribuidora;
	
	@ManyToMany
	@JoinColumn(name = "FK_PRODUTORA")
	private List<Produtora> produtora;
	
	@ManyToMany
	@JoinColumn(name = "FK_PATROCINADOR")
	private List<Patrocinador> patrocinador;

	public Filme() {}

	public Filme(Integer id, String nome, Integer duracaoMinuto, LocalDate dataLancamento, Classificacao classificacao,
			Roteiro roteiro, Diretor diretor, List<Distribuidora> distribuidora, List<Produtora> produtora,
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

	public List<Distribuidora> getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(List<Distribuidora> distribuidora) {
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
