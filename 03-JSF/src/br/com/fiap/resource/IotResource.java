package br.com.fiap.resource;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.IotTo;

public class IotResource implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  Client client = Client.create();
	private WebResource resource;
	//urll 
	private static final String url = "http://10.3.8.30:1880/arduino/api/dados";
	private static final String urlLed = "http://10.3.8.30:1880/led/";
	private static final String urlBuzzer = "http://10.3.8.30:1880/buzzer/";
	
	private static final String urlLocal = "http://localhost:8080/02-oit/rest/iot";
	private ClientResponse resp;
	private IotTo iot;
	
	
	public List<IotTo> listas (){
		resource = client.resource(url);
		resp = resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(resp.getStatus() != 200) {
			return null;
		}
		
		iot = resp.getEntity(IotTo.class);
		
		
		return  Arrays.asList(iot);
		
	}
	public List<IotTo> listar (){
		resource = client.resource(urlLocal);
		resp = resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(resp.getStatus() != 200) {
			return null;
		}
		
		 IotTo[] iots = resp.getEntity(IotTo[].class);
		
		
		return  Arrays.asList(iots);
		
	}
	
	public String ligarLed(String status) {
		resource = client.resource(urlLed+status);
		resp = resource.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class);
		return resp.getEntity(String.class);
	}
	
	public String ligarBuzzer(String status) {
		resource = client.resource(urlBuzzer+status);
		System.out.println(urlBuzzer+status);
		resp = resource.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class);
		return resp.getEntity(String.class);
	}

}
