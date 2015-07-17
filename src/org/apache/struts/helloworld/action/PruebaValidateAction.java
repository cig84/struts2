package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;

public class PruebaValidateAction extends ActionSupport{
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		
		if(nombre.equals("Rajoy")) {
			addActionError("Rajoy, rajao!");
		}
		else {
			addActionMessage("Hola " + nombre + ", tu no eres un rajao como el Rajoy!");
		}
	}

}
