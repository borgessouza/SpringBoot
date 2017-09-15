package br.com.modelo.trainning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.modelo.trainning.facade.UsuarioFacade;
import br.com.modelo.trainning.model.Usuario;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioFacade usuarioFacade;


	@RequestMapping(value = "/")
	public @ResponseBody String hello() {
		return "Ola testes";

	}

	@RequestMapping(value = "/inserir")
	public @ResponseBody String inserir(@RequestParam String nome, @RequestParam String sobrenome) {
		usuarioFacade.inserirUsuario(new Usuario(nome, sobrenome,"tivit123"));
		return nome + " " + sobrenome + " criado";
	}

	
	@RequestMapping(value = "/encontrar")
	public @ResponseBody String encontrar(@RequestParam String nome,@RequestParam String sobrenome) {
		Usuario usuario = usuarioFacade.recuperarUsuario(nome, sobrenome);
		return usuario.getNome();
	}

}
