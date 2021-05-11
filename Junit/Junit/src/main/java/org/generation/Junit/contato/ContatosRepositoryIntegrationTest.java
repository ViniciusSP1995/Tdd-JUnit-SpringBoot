package org.generation.Junit.contato;

import org.generation.Junit.model.ContatoModel;
import org.generation.Junit.repository.ContatoRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ContatosRepositoryIntegrationTest {
	
	private ContatoModel contato;
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Before
	public void start() {
		contato = new ContatoModel("Gabriel", "011y", "9xxxxxxx9");
	}
	
	@Test (expected = RuntimeException.class)
	public void salvarComTelNulo() throws Exception {
		contato.setTelefone(null);
		contatoRepository.save(contato);
	}
	
	@Test (expected = RuntimeException.class)
	public void salvarComDddNulo() throws Exception {
		
		contato.setDdd(null);
		contatoRepository.save(contato);
	}
	@Test (expected = RuntimeException.class)
	public void salvarComNomeNulo() throws Exception {
		
		contato.setNome(null);
		contatoRepository.save(contato);
	}
}
