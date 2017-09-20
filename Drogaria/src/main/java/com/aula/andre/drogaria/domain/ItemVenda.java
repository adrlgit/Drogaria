package com.aula.andre.drogaria.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@SuppressWarnings("serial")
public class ItemVenda extends GenericDomain {
	
	@Column(nullable = false)
	private Short quantidade;
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal precoParcial;
	
	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Funcionario funcionario;
}
