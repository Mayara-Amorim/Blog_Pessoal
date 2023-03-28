package com.generation.blogpessoal.BlogP.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.BlogP.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario>findByUsuario(String usuario);
	//SELECT * FROM tb_usuario WHERE usuario = "usuario"; QUERY METHOD
	

}
