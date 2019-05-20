package br.com.fiap.test;

import java.util.List;

import br.com.fiap.resource.IotResource;
import br.com.fiap.to.IotTo;

public class testeConsumoAPI {

	public static void main(String[] args) {
		IotResource resource = new IotResource();
		List<IotTo> listas =  resource .listas();
		
		for(IotTo iot : listas) {
			System.out.println(iot.getTemperatura());
		}
		
	}

}
