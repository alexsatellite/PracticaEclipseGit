package me.Alex.GitEjercicio;

public class Reloj {
	private int hora, minutos, segundos;
	
	public Reloj(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public int getHora() {return this.hora;}
	public int getMinutos() {return this.minutos;}
	public int getSegundos() {return this.segundos;}
	
	
	public void setHora(int arg) {
		this.hora = arg;
	}
	
	public void setMinutos(int arg) {
		this.minutos = arg;	
	}

	public void setSegundos(int arg) {
		this.segundos = arg;
	}
	
}
