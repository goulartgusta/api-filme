package br.com.almavivasolutions.api_filme.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.almavivasolutions.api_filme.models.Filme;
import br.com.almavivasolutions.api_filme.utils.ApiLogger;
import br.com.almavivasolutions.api_filme.validation.FilmeValidator;

@Service
public class FilmeService {

	private final Map<Integer, Filme> filmes = new HashMap<>();

	public ResponseEntity<Map<Integer, Filme>> listarFilmes() {
		ApiLogger.logInfo("Listando todos os filmes.");
		return ResponseEntity.status(HttpStatus.OK).body(filmes);
	}

	public ResponseEntity<Filme> criarFilme(Filme novoFilme) {
		try {
			FilmeValidator.validarFilme(novoFilme);
			filmes.put(novoFilme.getId(), novoFilme);
			ApiLogger.logInfo("Criando filme com ID: " + novoFilme.getId());
			return ResponseEntity.status(HttpStatus.CREATED).body(novoFilme);

		} catch (IllegalArgumentException e) {
			ApiLogger.logError("Erro ao criar filme: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	public ResponseEntity<Filme> buscarPorId(Integer id) {
		try {
			FilmeValidator.validarId(id);
			if (!filmes.containsKey(id)) {
				ApiLogger.logWarn("Filme com ID " + id + " não encontrado.");
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}

			ApiLogger.logInfo("Buscando filme com ID: " + id);
			return ResponseEntity.status(HttpStatus.OK).body(filmes.get(id));

		} catch (IllegalArgumentException e) {
			ApiLogger.logError("Erro ao buscar filme: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	public ResponseEntity<Filme> atualizarFilme(Integer id, Filme filmeAtualizado) {
		try {
			FilmeValidator.validarId(id);
			FilmeValidator.validarFilme(filmeAtualizado);
			if (!filmes.containsKey(id)) {
				ApiLogger.logWarn("Filme com ID " + id + " não encontrado para atualização.");
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}

			filmeAtualizado.setId(id);
			filmes.put(id, filmeAtualizado);
			ApiLogger.logInfo("Atualizando filme com ID: " + id);
			return ResponseEntity.status(HttpStatus.OK).body(filmeAtualizado);

		} catch (IllegalArgumentException e) {
			ApiLogger.logError("Erro ao atualizar filme: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	public void deletarFilme(Integer id) {
		try {
			FilmeValidator.validarId(id);
			if (!filmes.containsKey(id)) {
				ApiLogger.logWarn("Filme com ID " + id + " não encontrado para remoção.");
				ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			filmes.remove(id);
			ApiLogger.logInfo("Removendo filme com ID: " + id);
			ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
		} catch (IllegalArgumentException e) {
			ApiLogger.logError("Erro ao remover filme: " + e.getMessage());
			ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
