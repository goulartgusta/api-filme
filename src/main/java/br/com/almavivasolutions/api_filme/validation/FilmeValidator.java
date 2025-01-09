package br.com.almavivasolutions.api_filme.validation;

import br.com.almavivasolutions.api_filme.models.Filme;

public class FilmeValidator {

	public static void validarFilme(Filme filme) {
		if (filme == null) {
			throw new IllegalArgumentException("Filme não pode ser nulo.");
		}
		
		if (filme.getNome() == null || filme.getNome().isEmpty()) {
			throw new IllegalArgumentException("O nome do filme é obrigatório.");
		}
		
		if (filme.getDuracaoMinuto() == null || filme.getDuracaoMinuto() <= 0) {
			throw new IllegalArgumentException("A duração do filme deve ser maior que zero.");
		}
		
		if (filme.getDataLancamento() == null) {
			throw new IllegalArgumentException("A data de lançamento é obrigatória.");
		}
	}

	public static void validarId(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException("ID não pode ser nulo.");
		}
		
		if (id <= 0) {
			throw new IllegalArgumentException("ID deve ser maior que zero.");
		}
	}
}
