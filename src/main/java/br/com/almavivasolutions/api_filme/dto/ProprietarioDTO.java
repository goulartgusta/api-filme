package br.com.almavivasolutions.api_filme.dto;

import java.util.List;

public record ProprietarioDTO(
		String nome,
		String paisOrigem,
		List<String> produtoras,
		Double receitaAnual) {

}
