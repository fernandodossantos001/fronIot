package br.com.fiap.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.fiap.resource.IotResource;
import br.com.fiap.to.IotTo;

@ManagedBean
@RequestScoped
public class IotBean {
	
	private IotTo iot ;
	
	private IotResource resource;
	
	private String status;
	
	private String statusBeep;
	
	@PostConstruct
	public void init() {
		resource = new IotResource();
	}


	
	public List<IotTo> listar(){
		List<IotTo> listas = resource.listas();
		
		if(listas.get(0).getLed()!=0 ) {
			setStatus("desligar");
		}else {
			setStatus("ligar");
		}
		
		if( listas.get(0).getBuzzer()!=0) {
			setStatusBeep("desligar");
		}else {
			setStatusBeep("ligar");
			
		}
		return listas;
	}
	
	public void ligarLed() {
		
		resource.ligarLed(status);
	}
	
	public void ligarBeep() {	
		System.out.println(statusBeep);
		resource.ligarBuzzer(statusBeep);
	}



	public IotTo getIot() {
		return iot;
	}



	public void setIot(IotTo iot) {
		this.iot = iot;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getStatusBeep() {
		return statusBeep;
	}



	public void setStatusBeep(String statusBeep) {
		this.statusBeep = statusBeep;
	}
	
	

}
