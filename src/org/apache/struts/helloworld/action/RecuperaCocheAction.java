package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

public class RecuperaCocheAction extends ActionSupport{
	
	private Coche coche;
	
	public String execute() throws Exception {
		return SUCCESS;
	}

	public Coche getCoche() {
		return coche;
	}

	@TypeConversion(converter="org.apache.struts.helloworld.action.ConversorCoche")
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	

}
