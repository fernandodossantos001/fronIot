package br.com.fiap.resource;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.dao.IotDAO;
import br.com.fiap.dao.impl.IotDAOImpl;
import br.com.fiap.entity.Iot;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

@Path("/iot")
public class IotResource {
	private IotDAO dao ;
	
	public IotResource() {
		dao = new IotDAOImpl(EntityManagerFactorySingleton.getInstance().createEntityManager());
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Iot> busca(){
		return dao.listar();
	}
}
