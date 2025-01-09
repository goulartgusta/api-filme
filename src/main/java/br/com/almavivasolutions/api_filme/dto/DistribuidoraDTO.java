package br.com.almavivasolutions.api_filme.dto;

import java.util.List;

public record DistribuidoraDTO(String nome,
		List<String> filmesDistribuídos,
		Integer anoFundação) {

}
