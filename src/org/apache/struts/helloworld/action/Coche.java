package org.apache.struts.helloworld.action;

public class Coche {
	
	private String marca;
	private String modelo;
	private String matricula;
	
	public Coche(String marca, String modelo, String matricula){
		
		this.setMarca(marca);
		this.setMatricula(matricula);
		this.setModelo(modelo);
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return getMarca()+" "+getModelo()+" "+getMatricula();
	}

}
