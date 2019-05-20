package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_IOT")
@SequenceGenerator(name="iot",sequenceName="TSQ_IOT",allocationSize=1)
public class Iot {
	@Id
	@GeneratedValue(generator="iot",strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="ds_humidade")
	private String humidade;
	@Column(name="ds_temperatura")
	private String temperatuda;
	
	public Iot() {
		
	}
	
	public Iot( String humidade, String temperatuda) {
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
