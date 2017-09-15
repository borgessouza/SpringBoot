package br.com.modelo.trainning.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.modelo.trainning.model.Usuario;
import br.com.modelo.trainning.repositories.UsuarioRepository;

@Component
public class UsuarioFacade {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public void inserirUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public Usuario recuperarUsuario(String nome, String sobrenome) {
		return usuarioRepository.findByNomeAndSobrenome(nome, sobrenome);
	}

	public Usuario trocarSenha(Usuario usuario, String senhaAtual, String novaSenha) {
		if (usuario.getPassword().equals(senhaAtual)) {
			usuario.setPassword(novaSenha);
		}
		return usuario;
	}

	public Usuario trocarSenha(String nome, String sobrenome, String senhaAtual, String novaSenha) {
		Usuario usuario = recuperarUsuario(nome, sobrenome);
		if (usuario.getPassword().equals(senhaAtual)) {
			usuario.setPassword(novaSenha);
		}
		return usuario;
	}
	
	public Usuario novaSenha(String nome, String sobrenome, String novaSenha) {
		Usuario usuario = recuperarUsuario(nome, sobrenome);
		usuario.setPassword(novaSenha);
		return usuario;
	}
	

}
