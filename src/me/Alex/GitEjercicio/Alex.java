package me.Alex.GitEjercicio;

public class Alex {
	private String nombre, apellidos, dni;
	
	public Alex(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	public String getNombre() {return this.nombre;}
	public String getApellidos() {return this.apellidos;}
	public String getDNI() {return this.dni;}
	

	public void setNombre(String arg) {
		this.nombre = arg;
	}
	public void setApellido(String arg) {
		this.apellidos = arg;
	}
	public void setDNI(String arg) {
		this.dni = arg;
	}
}
