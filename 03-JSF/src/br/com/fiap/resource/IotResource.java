package br.com.fiap.resource;

import java.util.Arrays;
import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.IotTo;

public class IotResource {
	
	private  Client client = Client.create();
	private WebResource resource;
	private static final String url = "http://localhost:8080/02-oit/rest/iot";
	private ClientResponse resp;
	private IotTo[] iot;
	
	public List<IotTo> listas (){
		resource = client.resource(url);
		resp = resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(resp.getStatus() != 200) {
			return null;
		}
		
		iot = resp.getEntity(IotTo[].class);
		return  Arrays.asList(iot);
		
	}

}
