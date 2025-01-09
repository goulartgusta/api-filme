package br.com.almavivasolutions.api_filme.dto;

public record PatrocinadorDTO(
		String nome,
		Double valorPatrocinado,
		String projetoPatrocinio,
		Integer mesesPatrocinio) {

}
