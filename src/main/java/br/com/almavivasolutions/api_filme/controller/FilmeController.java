package br.com.almavivasolutions.api_filme.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.almavivasolutions.api_filme.models.Filme;
import br.com.almavivasolutions.api_filme.service.FilmeService;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeService filmeservice;

    public FilmeController(FilmeService filmeRepository) {
        this.filmeservice = filmeRepository;
    }

    @GetMapping
    public ResponseEntity<Map<Integer, Filme>> listarFilmes() {
        return filmeservice.listarFilmes();
    }

    @PostMapping
    public ResponseEntity<Filme> criarFilme(@RequestBody Filme filme) {
        return filmeservice.criarFilme(filme);
    }

    @GetMapping("pesquisar-filme/{id}")
    public ResponseEntity<Filme> buscarFilmePorId(@PathVariable Integer id) {
        return filmeservice.buscarPorId(id);
    }

    @PatchMapping("atualizar-filme/{id}")
    public ResponseEntity<Filme> atualizarFilme(@PathVariable Integer id, @RequestBody Filme filmeAtualizado) {
        return filmeservice.atualizarFilme(id, filmeAtualizado);
    }

    @DeleteMapping("deletar-filme/{id}")
    public void deletarFilme(@PathVariable Integer id) {
        filmeservice.deletarFilme(id);
    }
}
