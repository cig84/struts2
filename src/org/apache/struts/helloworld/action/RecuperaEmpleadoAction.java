package org.apache.struts.helloworld.action;

import clasesServices.EmployeesServices;

import com.opensymphony.xwork2.ActionSupport;

import dataBaseHR.Employees;

public class RecuperaEmpleadoAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	/* declaramos atributos a nivel de clase para poder coger el valor pasado por el 
	 * .jsp con el get y para setear los atributos que tenemos que recoger desde el .jsp
	 * de salida. */
	private Employees emp;
	private int id;
	
	public String execute() throws Exception {
		/* en este método sacamos lo que necesitamos mostrar en el .jsp de salida. */
		EmployeesServices es = new EmployeesServices();
		emp = es.getEmpleId(this.id);
		return SUCCESS;
	}
	
	public Employees getEmp() {
		return emp;
	}

	public void setEmp(Employees emp) {
		this.emp = emp;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
