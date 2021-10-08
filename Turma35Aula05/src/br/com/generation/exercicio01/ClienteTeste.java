package br.com.generation.exercicio01;



public class ClienteTeste {

	public static void main(String[] args) {
	
		Cliente c = new Cliente();
		c.setNome("Pedro Plausivel");
		c.setIdade(18);
		c.setCpf("XXX.XXX.XXX-XX");
		c.setEmail("pedroplausivel123@fictionalmail.com");
		c.setGenero("masculino");
		c.setRg("XX.XXX.XXX-XX");
		c.setSaldo(250.0);
		c.setCelular("+XX (XX)XXXXX-XXXX");
		c.logar();
		System.out.println("nome: " + c.getNome() +
				"\nidade: " + c.getIdade() + "\ngênero: " + c.getGenero() +
				"\nEmail: " + c.getEmail() + "\nCPF: " + c.getCpf() + 
				"\nRG: " + c.getRg() + "\ncelular: " + c.getCelular() + 
				"\nsaldo atual: " + c.getSaldo() + " R$");
		
	

	}
}