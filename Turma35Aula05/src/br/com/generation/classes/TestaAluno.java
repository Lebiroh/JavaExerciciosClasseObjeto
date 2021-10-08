package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		//instancia de objeto --> criar o objeto
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno2.nome = "Penélope Proativa";
		aluno2.idade = 23;
		aluno2.curso = "Bloco II - Spring Boot\n";
		
		aluno1.nome = "Paulo Passivo";
		aluno1.idade = 19;
		aluno1.curso = "Bloco I - Java Puro\n";
		
		System.out.println("nome aluno: "+aluno1.nome);
		System.out.println("idade aluno: "+aluno1.idade);
		System.out.println("curso aluno: "+aluno1.curso);
		
		System.out.println("nome aluno: "+aluno2.nome);
		System.out.println("idade aluno: "+aluno2.idade);
		System.out.println("curso aluno: "+aluno2.curso);

		aluno1.assistirAula();
		aluno1.estudar();
		aluno1.fazerProva();
		
	}

}
