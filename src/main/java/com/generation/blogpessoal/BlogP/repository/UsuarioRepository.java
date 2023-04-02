package com.generation.blogpessoal.BlogP.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.BlogP.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario>findByUsuario(String usuario);
	//SELECT * FROM tb_usuario WHERE usuario = "usuario"; QUERY METHOD
	
	public List <Usuario> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);	
	

}
