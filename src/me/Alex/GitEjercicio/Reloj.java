package me.Alex.GitEjercicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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
	
	
	public void write() {
		// Copiar ficheros
		File origen = new File("origen.txt");
		File destino = new File("destino.txt");

		try {
		  InputStream in = new FileInputStream(origen);
		  OutputStream out = new FileOutputStream(destino);
						
		  byte[] buf = new byte[1024];
		  int len;

		  while ((len = in.read(buf)) > 0) {
		    out.write(buf, 0, len);
		  }
				
		  in.close();
		  out.close();
		} catch (IOException ioe){
		  ioe.printStackTrace();
		}
	}
}
