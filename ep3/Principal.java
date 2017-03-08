import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Principal {
	public static void main (String []v) {
		ArrayList<Aluno> aluno = new ArrayList<Aluno>();
		Aluno alunos1 = new Aluno();
		Aluno alunos2 = new Aluno();
		Aluno alunos3 = new Aluno();
		Aluno alunos4 = new Aluno();
		Aluno alunos5 = new Aluno();

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
		
		for (int i = 0; i < aluno.size(); i++) {
			System.out.println(aluno.get(i).getNome() + " - " + aluno.get(i).getIdade());
		}	

		Collections.sort(aluno);
		
		System.out.println();

		for (int i = 0; i < aluno.size(); i++) {
			System.out.println(aluno.get(i).getNome() + " - " + aluno.get(i).getIdade());
		}	

	}
}