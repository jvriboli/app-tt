package br.com.tt.service;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.tt.model.Aluno;

public class AlunoCadastroService {

	@Test
	public void cadastrarTest() {
		Aluno aluno = new Aluno();
		aluno.setNome("Pedro");
		aluno.setCpf("00000000000");
		aluno.salvar();
		
		assertEquals("Pedro", aluno.getNome());
		assertEquals("00000000000", aluno.getCpf());
	}

}
