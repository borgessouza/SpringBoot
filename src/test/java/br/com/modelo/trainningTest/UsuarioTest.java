package br.com.modelo.trainningTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.modelo.trainning.TrainningApplication;
import br.com.modelo.trainning.facade.UsuarioFacade;
import br.com.modelo.trainning.model.Usuario;
import br.com.modelo.trainning.repositories.UsuarioRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@SpringBootTest(classes = TrainningApplication.class)
public class UsuarioTest {

	@InjectMocks
	private UsuarioFacade usuarioFacade;
	
	@Autowired
    private TestEntityManager entityManager;

	@Autowired
	private UsuarioRepository usuarioRepository;

	private Usuario usuario;

	@Before
	public void setup() {
		usuario = new Usuario("UsuarioPadrao", "SobrenomePadrao", "senhaPadrao");
		entityManager.persist(usuario);
	}

	@Test
	public void testTrocaDeSenha() {
		String novaSenha = "padrao";
		usuarioFacade.trocarSenha(usuario, "senhaPadrao", novaSenha);
		assertEquals(usuario.getPassword(), novaSenha);
	}

	@Test
	public void testaRecuperaUsuarioAndTrocaSenha() {
		String novaSenha = "novaSenha";
		Usuario usuarioTrocarSenha = usuarioRepository.findByNomeAndSobrenome(usuario.getNome(), usuario.getSobrenome());
		usuarioFacade.trocarSenha(usuarioTrocarSenha, "senhaPadrao", novaSenha);
		assertEquals(usuario.getPassword(), novaSenha);

	}

	@Test
	public void testaRecuperaUsuarioAndTrocaSenhaV2() {
		String novaSenha = "novaSenha";
		usuarioFacade.trocarSenha(usuario.getNome(), usuario.getSobrenome(), "senhaPadrao", novaSenha);
		assertEquals(usuario.getPassword(), novaSenha);

	}

}
