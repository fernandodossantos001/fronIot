package br.com.fiap.to;

public class IotTo {
	private int id;
	private String humidade;
	private String temperatuda;
	
	public IotTo() {
		
	}
	
	public IotTo(int id, String humidade, String temperatuda) {
		super();
		this.id = id;
		this.humidade = humidade;
		this.temperatuda = temperatuda;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHumidade() {
		return humidade;
	}
	public void setHumidade(String humidade) {
		this.humidade = humidade;
	}
	public String getTemperatuda() {
		return temperatuda;
	}
	public void setTemperatuda(String temperatuda) {
		this.temperatuda = temperatuda;
	}
	
	

}
