package br.com.generation.classes02;

import java.util.Scanner;

public class TestaCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Scanner entrada = new Scanner(System.in);
			c1.marca = "elton musc";
			c1.modelo = "fuscão queimado";
			c1.ano = 2099;
			c1.velocidade = 0;
			entrada.close();
			
			c1.acelerar(120);{
				System.out.println(c1.marca);
				System.out.println(c1.modelo);
				System.out.println(c1.ano);
				System.out.println(c1.velocidade);
			}
			c1.freiar(30);{
				System.out.println(c1.velocidade);
			}

	}

}
