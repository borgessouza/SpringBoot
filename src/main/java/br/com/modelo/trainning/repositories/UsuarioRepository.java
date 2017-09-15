package br.com.modelo.trainning.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.modelo.trainning.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


	Usuario findByNomeAndSobrenome(String nome, String sobrenome);
	
	
}
