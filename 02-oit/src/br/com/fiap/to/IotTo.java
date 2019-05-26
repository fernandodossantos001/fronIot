package br.com.fiap.to;

import java.io.Serializable;

public class IotTo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hum;
	private int luz;
	private int buzzer;
	private int led;
	
	public IotTo() {
		
	}

	public IotTo(int hum, int luz, int buzzer, int led) {
		super();
		this.hum = hum;
		this.luz = luz;
		this.buzzer = buzzer;
		this.led = led;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	

}
