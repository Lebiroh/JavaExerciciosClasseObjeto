package br.com.generation.metodosobrecarregado;

public class TestaCalculadora {

	public static void main(String[] args) {
		MinhaCalculadora calcRetorno = new MinhaCalculadora();
		System.out.println("somando numeros " + calcRetorno.soma(23, 24));
		System.out.println("somando numeros " + calcRetorno.soma(12.3,15.6));
		System.out.println("somando numeros " + calcRetorno.soma(1, 2, 3));

	}

}
