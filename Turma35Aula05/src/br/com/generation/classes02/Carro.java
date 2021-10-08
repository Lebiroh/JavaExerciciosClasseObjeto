package br.com.generation.classes02;

public class Carro {
	//atributos
	String marca;
	String modelo;
	int ano;
	int velocidade;
	
	//métodos --> funções(verbos)
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void freiar(int reduzir) {
		velocidade -= reduzir;
		
	}
	

}
