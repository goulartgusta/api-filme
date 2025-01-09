package br.com.almavivasolutions.api_filme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.almavivasolutions.api_filme.models.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {

}

