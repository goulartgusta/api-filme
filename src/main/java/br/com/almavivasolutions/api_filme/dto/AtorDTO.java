package br.com.almavivasolutions.api_filme.dto;

import java.time.LocalDate;
import java.util.List;

public record AtorDTO(String nomeArtistico, LocalDate dataNascimento, List<String> filmesAtuados,
		Double cacheMedioPorFilme) {

}
