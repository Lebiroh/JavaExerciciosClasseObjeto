package br.com.generatio.encapsulamento;

public class Carro02 {
	//atributos privados
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	
	//getters e setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		//this pega o atributo la de cima
		this.marca = marca; //--> recebimento do parametro
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	

}
