package entities;

import java.io.Serializable;

public abstract class Produtos implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String categoria;
	protected String marca;
	protected String modelo;
	protected double tela;
     
	public Produtos(String marca, String modelo, double tela) {
		this.marca = marca;
		this.modelo = modelo;
		this.tela = tela;
	}
	
	public String getNome() {
		return modelo;
	}
	
	public abstract String funcionalidades();
	
}
	