package br.com.almavivasolutions.api_filme.dto;

import java.util.List;

import br.com.almavivasolutions.api_filme.models.Ator;

public record PersonagemDTO(
		String nome,
		String papel,
		String genero,
		List<Ator> ator) {

}
