package com.br.caronas.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Motorista extends GenericDomain{
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Carro carro;

}
