package com.aula.andre.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.aula.andre.drogaria.domain.Cliente;
import com.aula.andre.drogaria.domain.Pessoa;

public class ClienteDAOTest {
	@Test
	public void salvar() throws ParseException{
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(3L);
		
		Cliente cliente = new Cliente();
		
		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("23/08/2017"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);
		
		System.out.println("Cliente salvo com sucesso");
	}
}
