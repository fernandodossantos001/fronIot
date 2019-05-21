package br.com.fiap.resource;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.dao.IotDAO;
import br.com.fiap.dao.impl.IotDAOImpl;
import br.com.fiap.entity.Iot;
import br.com.fiap.excepiton.CommitException;
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
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String ligar(String status) {
//		
//		UriBuilder builder = url.getAbsolutePathBuilder();
//		builder.path(status);
//		
//		System.out.println(status);
//
//		// HTTP Status Code : 201 Created
//		return Response.created(builder.build()).build();
		
		
		return status;
		
	}
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response ligar(Iot iot, @Context UriInfo url) {
//		
//		try {
//			dao.cadastrar(iot);
//			dao.commit();
//		} catch (CommitException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return Response.serverError().build();
//		}
//		UriBuilder builder = url.getAbsolutePathBuilder();
//		builder.path(String.valueOf(iot.getId()));
//		
//		// HTTP Status Code : 201 Created
//		return Response.created(builder.build()).build();
//		
//	}
}
