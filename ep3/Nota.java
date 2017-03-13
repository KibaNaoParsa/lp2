public class Nota implements Comparable<Nota>{
	public

		void setNota(double nota, Aluno aluno, Disciplina disciplina) {
			this.nota = nota;
			this.aluno = aluno;
			this.disciplina = disciplina;
		}	

		double getNota() {
			return this.nota;
		}

		Aluno getAluno() {
			return this.aluno;
		}

		String getAlunoNome() {
			return this.aluno.getNome();
		}

		String getDisciplinaNome() {
			return this.disciplina.getNome();
		}

		Disciplina getDisciplina() {
			return this.disciplina;
		}

		public int compareTo(Nota nota) {
			if(this.nota > nota.nota){
				return -1;
			} else if(this.nota < nota.nota) {
				return 1;
			}
			return this.aluno.getNome().compareToIgnoreCase(nota.aluno.getNome());
		}

	private
		double nota;
		Aluno aluno;
		Disciplina disciplina;	
}
