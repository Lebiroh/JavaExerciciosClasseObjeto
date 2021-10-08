package br.com.generatio.encapsulamento;

public class TestaCarro {

	public static void main(String[] args) {
		Carro02 c1 = new Carro02();
		
		c1.setMarca("fiat");
		c1.setCor("Rosa");
		c1.setModelo("fuscão");		
		c1.setAno(2002);

		System.out.println(c1.getMarca());
		System.out.println(c1.getCor());
		System.out.println(c1.getModelo());
		System.out.println(c1.getAno());
		
	}

}
