package com.aula.andre.drogaria.dao;

import org.junit.Ignore;
import org.junit.Test;

import com.aula.andre.drogaria.domain.Pessoa;
import com.aula.andre.drogaria.domain.Usuario;

public class UsuarioDAOTest {
	@Test
	@Ignore
	public void salvar(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);
		
		System.out.println("Pessoa Encontrada");
		System.out.println("Nome "+pessoa.getNome());
		System.out.println("CPF: "+pessoa.getCpf());
		System.out.println("Tel: "+pessoa.getEmail());
		
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("");
		usuario.setTipo('A');
		
		UsuarioDAO usuariDAO = new UsuarioDAO();
		usuariDAO.salvar(usuario);
		
		System.out.println("Usuario salvo com sucesso");
	}
}
