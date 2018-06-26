package com.jonwelzel.persistence.dao.produto;

import javax.persistence.EntityManager;

import com.univel.persistence.dao.GenericDAO;
import com.univel.persistence.entities.Produto;

public class ProdutoDAO extends GenericDAO<Long, Produto> {

	public ProdutoDAO(EntityManager em) {
		super(Produto.class, em);
	}

}
