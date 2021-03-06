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
@SequenceGenerator(name="iot",sequenceName="T_SQ_IOT",allocationSize=1)
public class Iot {
	@Id
	@GeneratedValue(generator="iot",strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="ds_hum")
	private int hum;
	@Column(name="ds_luz")
	private int luz;
	@Column(name="ds_buzzer")
	private int buzzer;
	@Column(name="ds_led")
	private int led;
	

	
	public Iot(int hum, int luz, int buzzer, int led) {
		this.hum = hum;
		this.luz = luz;
		this.buzzer = buzzer;
		this.led = led;
	}
	
	public Iot() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
	}
	public int getLuz() {
		return luz;
	}
	public void setLuz(int luz) {
		this.luz = luz;
	}
	public int getBuzzer() {
		return buzzer;
	}
	public void setBuzzer(int buzzer) {
		this.buzzer = buzzer;
	}
	public int getLed() {
		return led;
	}
	public void setLed(int led) {
		this.led = led;
	}
	

}
