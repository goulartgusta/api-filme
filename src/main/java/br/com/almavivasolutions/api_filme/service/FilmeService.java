package br.com.almavivasolutions.api_filme.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.almavivasolutions.api_filme.models.Filme;
import br.com.almavivasolutions.api_filme.utils.ApiLogger;

@Service
public class FilmeService {
	
    private final Map<Integer, Filme> filmes = new HashMap<>();

    public Map<Integer, Filme> listarFilmes() {
        ApiLogger.logInfo("Listando todos os filmes.");
        return filmes;
    }

    public Filme criarFilme(Filme novoFilme) {
        filmes.put(novoFilme.getId(), novoFilme);
        ApiLogger.logInfo("Criando filme com ID: " + novoFilme.getId());
        return novoFilme;
    }

    public Filme buscarPorId(Integer id) {
        ApiLogger.logInfo("Buscando filme com ID: " + id);
        return filmes.get(id);
    }

    public Filme atualizarFilme(Integer id, Filme filmeAtualizado) {
        filmeAtualizado.setId(id);
        filmes.put(id, filmeAtualizado); 
        ApiLogger.logInfo("Atualizando filme com ID: " + id);
        return filmeAtualizado;
    }

    public void deletarFilme(Integer id) {
        filmes.remove(id); 
        ApiLogger.logInfo("Removendo filme com ID: " + id);
    }
}
