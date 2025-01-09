package br.com.almavivasolutions.api_filme.dto;

import java.util.List;

public record DiretorDTO(String nome, String especialidade, Integer anosExperiência, List<String> filmesDirigidos) {

}
