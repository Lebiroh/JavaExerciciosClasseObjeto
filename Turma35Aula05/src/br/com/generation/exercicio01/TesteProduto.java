package br.com.generation.exercicio01;

public class TesteProduto {

	public static void main(String[] args) {
		ProdutoEletronico p = new ProdutoEletronico();
		p.setModelo("Pc Asus");
		p.setCor("Ecru");
		p.setNumeroSerie(1234);
		p.setSaldo(2000.00);
		p.setPreco(1500.00);
		
		System.out.println(p.getModelo());
		System.out.println("cor do modelo: " + p.getCor());
		System.out.println("número de série: " + p.getNumeroSerie());
		System.out.println("Saldo cliente: " + p.getSaldo() + " R$");
		System.out.println("Preço do produto: " + p.getPreco() + " R$");
		p.pagar();
		

	}

}
