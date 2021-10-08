package br.com.generation.exercicio01;

/*
 * 3) Crie uma classe produto eletrônico e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um objeto produto 
 * eletrônico, defina as instancias deste objeto e apresente as 
 * informações deste objeto no console.
*/
public class ProdutoEletronico {
	//atributos
	private String modelo, cor;
	private double preco, saldo;
	private int numeroSerie;
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	void pagar() {
		System.out.println("Saldo atual pós pagamento: " + (this.saldo - this.preco) + " R$") ;
		if(this.saldo - this.preco < 0) {
			System.out.println("o cliente está em dívida");
		}
	}
	public int getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	
	

}
