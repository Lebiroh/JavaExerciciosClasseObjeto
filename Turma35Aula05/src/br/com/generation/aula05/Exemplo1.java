package br.com.generation.aula05;

import java.util.Scanner;

public class Exemplo1 {
	static int subtracao, num1, num2, soma;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n3, n4;
		System.out.println("digite o numero 3: ");
		n3 = entrada.nextInt();
		System.out.println("digite o numero 4: ");
		n4 = entrada.nextInt();
		entrada.close();
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo5();
		System.out.println(Exemplo1Fora.metodo6(n3, n4));

	}

	public static void metodo1() {
		System.out.println("metodo 1");
		num1 = 3;
		
	}
	public static void metodo2() {
		int numero = 1, numero2 = 2, soma;
		soma= numero + numero2;
		System.out.println("soma: " + soma);
		num2 =4;
		
	}
	public static void metodo3() {
		subtracao = num1- num2;
		System.out.println("subtração: " + subtracao);
	}
	public static void metodo4() {
		soma = num1 + num2;
		System.out.println("soma: " + soma);
	}
	public static void metodo5() {
		System.out.println(Exemplo1Fora.metodo6(20, 30));
		
	}


}
