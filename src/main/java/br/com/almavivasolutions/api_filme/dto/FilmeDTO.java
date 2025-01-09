package br.com.almavivasolutions.api_filme.dto;

import java.time.LocalDate;
import java.util.List;

import br.com.almavivasolutions.api_filme.models.Classificacao;
import br.com.almavivasolutions.api_filme.models.Diretor;
import br.com.almavivasolutions.api_filme.models.Distribuidora;
import br.com.almavivasolutions.api_filme.models.Patrocinador;
import br.com.almavivasolutions.api_filme.models.Produtora;
import br.com.almavivasolutions.api_filme.models.Roteiro;

public record FilmeDTO(
		String nome, 
		Integer duracaoMinuto, 
		LocalDate dataLancamento, 
		Classificacao classificacao,
        Roteiro roteiro, 
        Diretor diretor, 
        List<Distribuidora> distribuidora, 
        List<Produtora> produtora,
        List<Patrocinador> patrocinador) {

}
