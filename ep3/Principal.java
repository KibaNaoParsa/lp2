import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Principal {
	public static void main (String []v) {
		ArrayList<Aluno> aluno = new ArrayList<Aluno>();
		ArrayList<Nota> nota = new ArrayList<Nota>();
		ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
		
		Aluno alunos1 = new Aluno();
		Aluno alunos2 = new Aluno();
		Aluno alunos3 = new Aluno();
		Aluno alunos4 = new Aluno();
		Aluno alunos5 = new Aluno();

		Disciplina disciplina1 = new Disciplina();
		Disciplina disciplina2 = new Disciplina();

		Nota nota1 = new Nota();
		Nota nota2 = new Nota();
		Nota nota3 = new Nota();
		Nota nota4 = new Nota();
		Nota nota5 = new Nota();
		Nota nota6 = new Nota();
		Nota nota7 = new Nota();
		Nota nota8 = new Nota();
		Nota nota9 = new Nota();
		Nota nota10 = new Nota();


		alunos1.setAluno("João das Couves", 20); 
		aluno.add(alunos1);
		alunos2.setAluno("Carlos da Silva", 18);
		aluno.add(alunos2);
		alunos3.setAluno("Paulo Guina", 30);
		aluno.add(alunos3);
		alunos4.setAluno("Wagner Machado", 10);
		aluno.add(alunos4);
		alunos5.setAluno("Jorge Oliveira", 23);
		aluno.add(alunos5);
		
		disciplina1.setDisciplina("LP2", "Herbert Fernandes");
		disciplina.add(disciplina1);
		disciplina2.setDisciplina("WEB", "Marcelo Mussel");
		disciplina.add(disciplina2);

		nota1.setNota(7, alunos1, disciplina1);
		nota.add(nota1);
		nota2.setNota(5, alunos1, disciplina2);
		nota.add(nota2);
		nota3.setNota(6, alunos2, disciplina1);
		nota.add(nota3);
		nota4.setNota(2, alunos2, disciplina2);
		nota.add(nota4);
		nota5.setNota(9.5, alunos3, disciplina1);
		nota.add(nota5);
		nota6.setNota(10, alunos3, disciplina2);
		nota.add(nota6);
		nota7.setNota(0, alunos4, disciplina1);
		nota.add(nota7);
		nota8.setNota(2, alunos4, disciplina2);
		nota.add(nota8);
		nota9.setNota(3, alunos1, disciplina1);
		nota.add(nota9);
		nota10.setNota(5.5, alunos1, disciplina2);
		nota.add(nota10);

		for (int i = 0; i < aluno.size(); i++) {
			System.out.println(aluno.get(i).getNome() + " - " + aluno.get(i).getIdade());
		}	

		Collections.sort(aluno);
		
		System.out.println();

		for (int i = 0; i < aluno.size(); i++) {
			System.out.println(aluno.get(i).getNome() + " - " + aluno.get(i).getIdade());
		}	

		System.out.println();

		for (int i = 0; i < nota.size(); i++) {
			System.out.println(nota.get(i).getAlunoNome() + " - " + nota.get(i).getDisciplinaNome() + ": " + nota.get(i).getNota());
		}	
		

	}
}
