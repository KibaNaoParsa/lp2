public class Disciplina {
	
	public
		
		void setDisciplina(String nome, String professor) {
			this.nome = nome;
			this.professor = professor;
		}	

		String getNome() {
			return this.nome;
		}	

		String getProfessor() {
			return this.professor;
		}
	
	private
		String professor;
		String nome;
}
