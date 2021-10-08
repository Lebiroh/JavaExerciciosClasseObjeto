package br.com.generation.classes;

public class Aluno {
	//atributos - variaveis
	//vem por padrão public caso n for encapsular no private
	public String nome;
	int idade;
	//este aqui está como public como exemplo
	String curso;
	
	//métodos - funções - funcionalidades
	void assistirAula() {
		System.out.println("aluno assistindo aula");
	}
	void estudar() {
		System.out.println("aluno estudando");
	}
	void fazerProva() {
		System.out.println("aluno fazendo prova");
	}

}
