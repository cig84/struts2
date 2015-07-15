package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;

public class RecuperaPersonaAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private Persona persona;
	private String nombre;
	private int edad;
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String execute() throws Exception {
		
		persona = new Persona(this.nombre, this.edad);
		return SUCCESS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Persona getPersona(){
		return persona;
		
	}

}
