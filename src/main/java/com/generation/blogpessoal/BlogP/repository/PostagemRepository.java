package com.generation.blogpessoal.BlogP.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.BlogP.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
//	Instrução SQL equivalente
//
//	SELECT * FROM tb_postagens WHERE titulo LIKE "%titulo%";
}
