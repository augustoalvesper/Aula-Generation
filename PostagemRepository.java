package br.org.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

// interface somente assina os métodos. a implementação só é feita em classes

@Repository
public interface PostagemRepository extends JpaRepository <Postagem, Long> {

	
	
}
