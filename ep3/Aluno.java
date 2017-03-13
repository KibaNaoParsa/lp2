public class Aluno implements Comparable<Aluno> {

	public

		void setAluno (String name, int age) {
			this.nome = name;
			this.idade = age;
		}

		String getNome(){
			return this.nome;
		}

		int getIdade(){
			return this.idade;
		}

		public int compareTo(Aluno aluno) {
      	  if(this.idade < aluno.idade){
            return -1;
        	  }
        	else if(this.idade > aluno.idade){
            return 1;
        		}
        return this.getNome().compareToIgnoreCase(aluno.getNome());
   	 }

	private

		String nome;
		int idade;

}
