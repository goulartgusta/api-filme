package br.com.almavivasolutions.api_filme.dto;

import java.util.List;

import br.com.almavivasolutions.api_filme.models.Personagem;

public record RoteiroDTO(
		String titulo,
		String enredo,
		String tema,
		String contextoHistorico,
		List<Personagem> personagem) {

}
