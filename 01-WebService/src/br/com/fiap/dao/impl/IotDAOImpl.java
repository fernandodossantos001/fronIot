package br.com.fiap.dao.impl;
import javax.persistence.EntityManager;

import br.com.fiap.dao.IotDAO;
import br.com.fiap.dao.impl.GenericDAOImpl;
import br.com.fiap.entity.Iot;

public class IotDAOImpl extends GenericDAOImpl<Iot, Integer> implements IotDAO {

	public IotDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
