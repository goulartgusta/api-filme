package br.com.almavivasolutions.api_filme.dto;

import java.util.List;

import br.com.almavivasolutions.api_filme.models.Proprietario;

public record ProdutoraDTO(
		String nome,
		String paisOrigem,
		List<String> filmesProduzidos,
		Double receitaAnual,
		Proprietario proprietario) {

}
